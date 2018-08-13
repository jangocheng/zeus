/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.controller.base;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import com.f6car.base.common.Result;
import com.f6car.base.common.ResultGenerator;
import com.f6car.base.common.So;
import com.f6car.base.common.Vo;
import com.f6car.base.core.ExcelExport;
import com.f6car.base.core.ExcelExportParam;
import com.f6car.base.core.F6Static;
import com.f6car.base.extend.excel.IExcel;
import com.f6car.base.extend.excel.TitleCell;
import com.github.pagehelper.PageHelper;
import com.google.common.base.Function;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiOperation;
import org.reflections.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author qixiaobo
 */
public abstract class AbstractRestWithSchemaController<T extends Vo, V extends Vo, S extends So, PK extends Serializable> extends AbstractRestController<V, S, PK> {
    protected static final LoadingCache<Class, List<TitleCell>> CLASS_CELL_LIST = CacheBuilder.newBuilder().build(new CacheLoader<Class, List<TitleCell>>() {
        @Override
        public List<TitleCell> load(Class key) throws Exception {
            Set<Field> allFields = ReflectionUtils.getAllFields(key);
            List<ExcelExportEntity> entitiesList = Lists.newArrayListWithExpectedSize(allFields.size());
            for (Field allField : allFields) {
                if (allField.isAnnotationPresent(Excel.class)) {
                    Excel annotation = allField.getAnnotation(Excel.class);
                    ExcelExportEntity entity = new ExcelExportEntity(allField.getName(), annotation.name());
                    entity.setOrderNum(Integer.parseInt(annotation.orderNum()));
                    entitiesList.add(entity);
                }
            }
            return getTitleCell(entitiesList);
        }
    });

    protected static List<TitleCell> getTitleCell(List<ExcelExportEntity> entities) {
        Collections.sort(entities);
        List<TitleCell> transform = Lists.transform(entities, new Function<ExcelExportEntity, TitleCell>() {
            @Override
            public TitleCell apply(ExcelExportEntity input) {
                String fieldName = (String) input.getKey();
                TitleCell titleCell = new TitleCell(fieldName, input.getName());
                return titleCell;
            }
        });
        return transform;
    }

    @Override
    @GetMapping
    @ApiOperation(value = "获取实体列表", notes = "")
    public Result list(S so) {
        PageHelper.startPage(so.getCurrentPage(), so.getPageSize());
        List<V> list = service.findAll();
        IExcel<V> iExcel = newExcelSchemaInstance(list);
        excelExportParam(iExcel);
        return ResultGenerator.genSuccessResult(iExcel);
    }

    protected abstract IExcel<V> newExcelSchemaInstance(List<V> list);

    protected void excelExportParam(IExcel<V> iexcel) {
        excelExportParam();
        ExcelExportParam excelExportParam = F6Static.getExcelExportParam();
        ExcelExport excelExport = excelExportParam.getExcelExport();
        if (excelExport == ExcelExport.NormalExcel) {
            //需要封装具体的schema
            List<TitleCell> unchecked = CLASS_CELL_LIST.getUnchecked(excelExportParam.getClazz());
            iexcel.setDataCells(unchecked);
        } else if (excelExport == ExcelExport.MapExcel) {
            List<TitleCell> titleCell = getTitleCell(excelExportParam.getExcelExportEntities());
            iexcel.setDataCells(titleCell);
        }

    }


}
