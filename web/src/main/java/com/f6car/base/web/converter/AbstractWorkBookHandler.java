/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.converter;

import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.f6car.base.common.Vo;
import com.f6car.base.extend.excel.Cell;
import com.f6car.base.extend.excel.EmptyCell;
import com.f6car.base.extend.excel.IExcelWithTotal;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Maps;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.f6car.base.core.F6Static.getExcelExportParam;

/**
 * @author qixiaobo
 */
public abstract class AbstractWorkBookHandler implements WorkBookHandler {
    protected static final LoadingCache<Class, Map<String, Field>> CLASS_FIELD_MAP = CacheBuilder.newBuilder().build(new CacheLoader<Class, Map<String, Field>>() {
        @Override
        public Map<String, Field> load(Class key) throws Exception {
            Set<Field> allFields = ReflectionUtils.getAllFields(key);
            Map<String, Field> map = Maps.newHashMapWithExpectedSize(allFields.size());
            for (Field allField : allFields) {
                allField.setAccessible(true);
                map.put(allField.getName(), allField);
            }
            return map;
        }
    });
    private static final String DEFAULT_EMPTY_STR = "-";

    protected void createStringCell(Row row, int index, String text,
                                    ExcelType type) {
        org.apache.poi.ss.usermodel.Cell cell = row.createCell(index);
        RichTextString rtext;
        if (type.equals(ExcelType.HSSF)) {
            rtext = new HSSFRichTextString(text);
        } else {
            rtext = new XSSFRichTextString(text);
        }
        cell.setCellValue(rtext);
    }

    protected void processTotal(Workbook workbook, IExcelWithTotal iExcelWithTotal, int sheet) {
        List<Cell> totalCells = iExcelWithTotal.getTotalCells();
        Vo total = iExcelWithTotal.getTotal();
        if (total != null) {
            Sheet sheetAt = workbook.getSheetAt(sheet);
            int rowNum = sheetAt.getLastRowNum() + 1;
            Row row = sheetAt.createRow(rowNum);
            int index = 0;
            Map<String, Field> unchecked = CLASS_FIELD_MAP.getUnchecked(total.getClass());
            ExcelType type = getExcelExportParam().getExportParams().getType();
            for (Cell totalCell : totalCells) {
                if (totalCell instanceof EmptyCell) {
                    createStringCell(row, index, DEFAULT_EMPTY_STR, type);
                } else {
                    Field field = unchecked.get(totalCell.getName());
                    try {
                        Object o = field.get(total);
                        String cellText = o == null ? "" : o.toString();
                        createStringCell(row, index, cellText, type);
                        if (totalCell.getWidth() > 1) {
                            sheetAt.addMergedRegion(
                                    new CellRangeAddress(rowNum, rowNum, index, index + totalCell.getWidth() - 1));
                        }
                    } catch (IllegalAccessException ignore) {
                        // ignore
                    }
                }

                index += totalCell.getWidth();
            }
        }
    }
}
