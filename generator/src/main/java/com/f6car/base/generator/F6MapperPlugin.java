/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.generator;

import com.f6car.base.common.Po;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import tk.mybatis.mapper.generator.MapperPlugin;

import static com.f6car.base.generator.CodeGenerator.PO_FIELDS;

/**
 * @author qixiaobo
 */
public class F6MapperPlugin extends MapperPlugin {
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        //PK
        topLevelClass.addImportedType(Po.class.getName());
        topLevelClass.setSuperClass("Po");
        PO_FIELDS.set(topLevelClass.getFields());
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

}
