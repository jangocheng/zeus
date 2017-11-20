/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.generator;

import com.google.common.base.CaseFormat;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.joda.time.DateTime;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.f6car.base.constant.Constants.*;

/**
 * @author qixiaobo
 */
public class CodeGenerator {
    //JDBC配置，请修改为你项目的实际配置
    private static final String JDBC_URL = "jdbc:mysql://192.168.1.7:3306/f6dms_20160522";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "root";
    private static final String JDBC_DIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

    private static final String PROJECT_PATH = System.getProperty("user.dir");//项目在硬盘上的基础路径
    private static final String TEMPLATE_FILE_PATH = PROJECT_PATH + "/src/test/resources/template";//模板位置

    private static final String JAVA_PATH = "/src/main/java"; //java文件路径
    private static final String RESOURCES_PATH = "/src/main/resources";//资源文件路径

    private static final String PACKAGE_PATH_SERVICE = packageConvertPath(SERVICE_PACKAGE);//生成的Service存放路径
    private static final String PACKAGE_PATH_SERVICE_IMPL = packageConvertPath(SERVICE_IMPL_PACKAGE);//生成的Service实现存放路径
    private static final String PACKAGE_PATH_CONTROLLER = packageConvertPath(CONTROLLER_PACKAGE);//生成的Controller存放路径
    private static final String PACKAGE_PATH_SO = packageConvertPath(SO_PACKAGE);
    private static final String PACKAGE_PATH_VO = packageConvertPath(VO_PACKAGE);
    private static final String AUTHOR = "CodeGenerator";//@author
    private static final String DATE = new DateTime().toString("yyyy-MM-dd");//@date
    private static final Splitter TABLE_NAME_SPLITTER = Splitter.on(UNDER_LINE).trimResults().omitEmptyStrings();
    private static GroupTemplate gt;

    static {
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("template");
        org.beetl.core.Configuration cfg = null;
        try {
            cfg = org.beetl.core.Configuration.defaultConfiguration();
        } catch (IOException e) {
            e.printStackTrace();
        }
        gt = new GroupTemplate(resourceLoader, cfg);
    }

    public static void main(String[] args) throws IOException {
        genCode("tb_user");
    }

    /**
     * 通过数据表名称生成代码，Model 名称通过解析数据表名称获得，下划线转大驼峰的形式。
     * 如输入表名称 "t_user_detail" 将生成 TUserDetail、TUserDetailMapper、TUserDetailService ...
     *
     * @param tableNames 数据表名称...
     */
    public static void genCode(String... tableNames) throws IOException {
        for (String tableName : tableNames) {
            genCodeByCustomModelName(tableName, null);
        }
    }

    /**
     * 通过数据表名称，和自定义的 Model 名称生成代码
     * 如输入表名称 "t_user_detail" 和自定义的 Model 名称 "User" 将生成 User、UserMapper、UserService ...
     *
     * @param tableName 数据表名称
     * @param modelName 自定义的 Model 名称
     */
    public static void genCodeByCustomModelName(String tableName, String modelName) throws IOException {
        String subPackage = "";
        List<String> strings = TABLE_NAME_SPLITTER.splitToList(tableName);
        if (strings.size() >= 2) {
            if (strings.get(0).length() <= 2) {
                subPackage = strings.get(1);
            }
        }

        genModelAndMapper(tableName, modelName, subPackage);
        genService(tableName, modelName, subPackage);
        genController(tableName, modelName, subPackage);
    }


    public static void genModelAndMapper(String tableName, String modelName, String subPackageName) {
        Context context = new Context(ModelType.FLAT);
        context.setId("f6car");
        context.setTargetRuntime("MyBatis3Simple");
        context.addProperty(PropertyRegistry.CONTEXT_BEGINNING_DELIMITER, "`");
        context.addProperty(PropertyRegistry.CONTEXT_ENDING_DELIMITER, "`");

        JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setConnectionURL(JDBC_URL);
        jdbcConnectionConfiguration.setUserId(JDBC_USERNAME);
        jdbcConnectionConfiguration.setPassword(JDBC_PASSWORD);
        jdbcConnectionConfiguration.setDriverClass(JDBC_DIVER_CLASS_NAME);
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);

        PluginConfiguration pluginConfiguration = new PluginConfiguration();
        pluginConfiguration.setConfigurationType(F6MapperPlugin.class.getName());
        pluginConfiguration.addProperty("mappers", MAPPER_INTERFACE_REFERENCE);
        context.addPluginConfiguration(pluginConfiguration);

        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetProject(PROJECT_PATH + Module.model.moduleDir + JAVA_PATH);
        String javaPackage = MODEL_PACKAGE;
        String mapperPackage = MAPPER_PACKAGE;
        String xmlPackage = "mapper";
        if (!Strings.isNullOrEmpty(subPackageName)) {
            javaPackage += ("." + subPackageName);
            mapperPackage += ("." + subPackageName);
            xmlPackage += ("/" + subPackageName);
        }
        javaModelGeneratorConfiguration.setTargetPackage(javaPackage);
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);

        SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfiguration.setTargetProject(PROJECT_PATH + Module.dao.moduleDir + RESOURCES_PATH);
        sqlMapGeneratorConfiguration.setTargetPackage(xmlPackage);
        context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);

        JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfiguration.setTargetProject(PROJECT_PATH + Module.dao.moduleDir + JAVA_PATH);
        javaClientGeneratorConfiguration.setTargetPackage(mapperPackage);
        javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);

        TableConfiguration tableConfiguration = new TableConfiguration(context);
        tableConfiguration.setTableName(tableName);
        if (!Strings.isNullOrEmpty(modelName)) {
            tableConfiguration.setDomainObjectName(modelName);
        }
        tableConfiguration.setGeneratedKey(new GeneratedKey("id", "Mysql", true, null));
        context.addTableConfiguration(tableConfiguration);

        List<String> warnings;
        MyBatisGenerator generator;
        try {
            Configuration config = new Configuration();
            config.addContext(context);
            config.validate();

            boolean overwrite = true;
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            warnings = new ArrayList<>();
            generator = new MyBatisGenerator(config, callback, warnings);
            generator.generate(null);
        } catch (Exception e) {
            throw new RuntimeException("生成Model和Mapper失败", e);
        }

        if (generator.getGeneratedJavaFiles().isEmpty() || generator.getGeneratedXmlFiles().isEmpty()) {
            throw new RuntimeException("生成Model和Mapper失败：" + warnings);
        }
        if (StringUtils.isEmpty(modelName)) {
            modelName = tableNameConvertUpperCamel(tableName);
        }
        System.out.println(modelName + ".java 生成成功");
        System.out.println(modelName + "Mapper.java 生成成功");
        System.out.println(modelName + "Mapper.xml 生成成功");
    }

    public static void genService(String tableName, String modelName, String subPackage) throws IOException {

        Map<String, Object> data = new HashMap<>();
        data.put("date", DATE);
        data.put("author", AUTHOR);
        String modelNameUpperCamel = StringUtils.isEmpty(modelName) ? tableNameConvertUpperCamel(tableName) : modelName;
        data.put("modelNameUpperCamel", modelNameUpperCamel);
        data.put("modelNameLowerCamel", tableNameConvertLowerCamel(tableName));
        data.put("basePackage", BASE_PACKAGE);
        String servicePackageDir = PROJECT_PATH + Module.service.moduleDir + JAVA_PATH + PACKAGE_PATH_SERVICE;
        String serviceImplPackageDir = PROJECT_PATH + Module.serviceimpl.moduleDir + JAVA_PATH + PACKAGE_PATH_SERVICE_IMPL;
        String soPackageDir = PROJECT_PATH + Module.dto.moduleDir + JAVA_PATH + PACKAGE_PATH_SO;
        String voPackageDir = PROJECT_PATH + Module.dto.moduleDir + JAVA_PATH + PACKAGE_PATH_VO;
        if (!Strings.isNullOrEmpty(subPackage)) {
            data.put("subPackage", "." + subPackage);
            servicePackageDir += ("/" + subPackage + "/");
            serviceImplPackageDir += ("/" + subPackage + "/");
            soPackageDir += ("/" + subPackage + "/");
            voPackageDir += ("/" + subPackage + "/");
        }


        generateByTemplate(gt, "/service.beetl", servicePackageDir + modelNameUpperCamel + "Service.java", data);
        generateByTemplate(gt, "/service-impl.beetl", serviceImplPackageDir + modelNameUpperCamel + "ServiceImpl.java", data);
        generateByTemplate(gt, "/so.beetl", soPackageDir + modelNameUpperCamel + "So.java", data);
        generateByTemplate(gt, "/vo.beetl", voPackageDir + modelNameUpperCamel + "Vo.java", data);


    }

    private static void generateByTemplate(GroupTemplate groupTemplate, String templateFile, String filename, Map data) throws IOException {
        File serviceFile = new File(filename);
        if (!serviceFile.getParentFile().exists()) {
            serviceFile.getParentFile().mkdirs();
        }
        Template template = groupTemplate.getTemplate(templateFile);
        template.binding(data);
        template.renderTo(new FileWriter(serviceFile));

        System.out.println(filename + "生成成功");
    }

    public static void genController(String tableName, String modelName, String subPackage) throws IOException {

        Map<String, Object> data = new HashMap<>();
        data.put("date", DATE);
        data.put("author", AUTHOR);
        String modelNameUpperCamel = StringUtils.isEmpty(modelName) ? tableNameConvertUpperCamel(tableName) : modelName;
        data.put("baseRequestMapping", modelNameConvertMappingPath(modelNameUpperCamel));
        data.put("modelNameUpperCamel", modelNameUpperCamel);
        data.put("modelNameLowerCamel", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, modelNameUpperCamel));
        data.put("basePackage", BASE_PACKAGE);
        String controllerPackageDir = PROJECT_PATH + Module.web.moduleDir + JAVA_PATH + PACKAGE_PATH_CONTROLLER;
        if (!Strings.isNullOrEmpty(subPackage)) {
            data.put("subPackage", "." + subPackage);
            controllerPackageDir += ("/" + subPackage + "/");
        }

        generateByTemplate(gt, "/controller.beetl", controllerPackageDir + modelNameUpperCamel + "Controller.java", data);
    }

    private static String tableNameConvertLowerCamel(String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, tableName.toLowerCase());
    }

    private static String tableNameConvertUpperCamel(String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());

    }

    private static String tableNameConvertMappingPath(String tableName) {
        tableName = tableName.toLowerCase();//兼容使用大写的表名
        return "/" + (tableName.contains("_") ? tableName.replaceAll("_", "/") : tableName);
    }

    private static String modelNameConvertMappingPath(String modelName) {
        String tableName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, modelName);
        return tableNameConvertMappingPath(tableName);
    }

    private static String packageConvertPath(String packageName) {
        return String.format("/%s/", packageName.contains(".") ? packageName.replaceAll("\\.", "/") : packageName);
    }

    private static enum Module {
        dao("/dao"), web("/web"), service("/service"), serviceimpl("/serviceimpl"), dto("/dto"), model("/model");
        private String moduleDir;

        Module(String moduleDir) {
            this.moduleDir = moduleDir;
        }
    }
}
