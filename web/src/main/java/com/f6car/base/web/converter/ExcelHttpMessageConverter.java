/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.web.converter;

import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.f6car.base.common.Result;
import com.f6car.base.core.ExcelExport;
import com.f6car.base.core.ExcelExportParam;
import com.f6car.base.core.F6Static;
import com.f6car.base.extend.excel.IExcel;
import com.f6car.base.extend.excel.IExcelWithTotal;
import com.github.pagehelper.PageInfo;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.f6car.base.core.F6Static.getExcelExportParam;

/**
 * @author qixiaobo
 */
public class ExcelHttpMessageConverter extends AbstractHttpMessageConverter<Object>
        implements GenericHttpMessageConverter<Object> {
    public static final MediaType EXCEL_MEDIA_TYPE = new MediaType("application", "vnd.ms-excel");

    private static final String LOGGER_PATTERN = "Excel export user:%s cost:%sms";

    private static final int MAX_SIZE = 1000;
    private List<WorkBookHandler> handlerList = Collections.emptyList();

    public ExcelHttpMessageConverter() {
        super(EXCEL_MEDIA_TYPE);
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    public void setHandlerList(List<WorkBookHandler> handlerList) {
        this.handlerList = handlerList;
    }

    @Override
    protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        Stopwatch stopwatch = Stopwatch.createStarted();
        HttpHeaders headers = outputMessage.getHeaders();
        Result result = (Result) o;
        ExcelExportParam excelExportParam = getExcelExportParam();
        ExcelType type = excelExportParam.getExportParams().getType();
        Object resultData = result.getData();
        Preconditions.checkArgument(resultData != null, "result data is null");
        boolean isIExcel = false;
        boolean isIExcelWithTotal = false;
        if (resultData instanceof IExcel) {
            isIExcel = true;
            if (isIExcel) {
                isIExcelWithTotal = resultData instanceof IExcelWithTotal;
            }
        }
        WorkBookHandler handler = null;
        for (WorkBookHandler workBookHandler : handlerList) {
            if (workBookHandler.canProcess(excelExportParam.getExcelExport())) {
                handler = workBookHandler;
            }
        }
        Preconditions.checkNotNull(handler);
        if (isIExcel) {
            handler.preProcess((IExcel) resultData);
        }

        Collection data = getActualData(result);
        Workbook workbook = getWorkBook(type, data.size());
        handler.process(workbook, data);
        if (isIExcelWithTotal) {
            handler.afterProcess(workbook, ((IExcelWithTotal) resultData));
        }
        if (excelExportParam.getFileName() != null) {
            String codedFileName = URLEncoder.encode(excelExportParam.getFileName(), "UTF8");
            headers.setContentDispositionFormData("attachment", codedFileName);
        }
        workbook.write(outputMessage.getBody());
        logger.info(String.format(LOGGER_PATTERN, F6Static.getUser(), stopwatch.elapsed(TimeUnit.MILLISECONDS)));
    }

    @Override
    public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
        //不支持excel
        return false;
    }

    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public boolean canWrite(Type type, Class<?> clazz, MediaType mediaType) {
        return super.canWrite(mediaType) && clazz == Result.class && support();
    }


    private boolean support() {
        ExcelExportParam param = getExcelExportParam();
        if (param == null || param.getExcelExport() == null || param.getExportParams() == null) {
            return false;
        }
        if (param.getExcelExport() == ExcelExport.NormalExcel || param.getExcelExport() == ExcelExport.MapExcel) {
            return true;
        } else {
            logger.warn(param.getExcelExport() + " not supprot now!");
            return false;
        }

    }

    @Override
    public void write(Object o, Type type, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        super.write(o, contentType, outputMessage);
    }

    private Collection getActualData(Result r) {
        if (r != null && r.getData() != null) {
            Object data = r.getData();
            if (data instanceof PageInfo) {
                data = ((PageInfo) data).getList();
            } else if (data instanceof IExcel) {
                data = ((IExcel) data).getData();
            } else if (!(data instanceof Collection)) {
                data = Lists.newArrayList(data);
            }
            return (Collection) data;

        }
        return Collections.emptyList();


    }

    private Workbook getWorkBook(ExcelType type, int size) {
        if (ExcelType.HSSF.equals(type)) {
            return new HSSFWorkbook();
        } else {
            if (size > MAX_SIZE) {
                //stream  默认情况下100条刷盘
                return new SXSSFWorkbook();
            } else {
                return new XSSFWorkbook();
            }
        }
    }
}
