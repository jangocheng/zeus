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

/**
 * @author qixiaobo
 */
public class F6MapperPlugin extends MapperPlugin {
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        //PK
        topLevelClass.addImportedType(Po.class.getName());
        topLevelClass.setSuperClass("Po");
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

}
