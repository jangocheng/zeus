/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.test.insurance;

import com.alibaba.fastjson.JSON;
import com.f6car.base.test.base.BaseTest;
import com.f6car.base.test.util.MockTestUtil;
import com.f6car.base.vo.insurance.TsInsuranceAttachmentVo;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class TsInsuranceAttachmentControllerTest extends BaseTest {
    private Integer pkId = 1;

    @Test
    public void testCRUD() throws Exception {
        TsInsuranceAttachmentVo tsInsuranceAttachment = MockTestUtil.getJavaBean(TsInsuranceAttachmentVo.class);
        tsInsuranceAttachment.setId(pkId);
        RequestBuilder request;
        //delete
        request = delete("/insurance/attachment/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //add
        request = post("/insurance/attachment")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(tsInsuranceAttachment));
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //get
        request = get("/insurance/attachment/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andExpect(jsonPath("data.pkId").value(pkId))
                .andReturn();
        request = get("/insurance/attachment");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();

        //update
        tsInsuranceAttachment = MockTestUtil.getJavaBean(TsInsuranceAttachmentVo.class);
        tsInsuranceAttachment.setId(pkId);
        request = put("/insurance/attachment")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(tsInsuranceAttachment));
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //get
        request = get("/insurance/attachment/" + pkId);
        MvcResult mvcResult = mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andExpect(jsonPath("data.pkId").value(pkId))
                .andReturn();

        //delete
        request = delete("/insurance/attachment/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();

    }

}
