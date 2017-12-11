/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.test.user;

import com.alibaba.fastjson.JSON;
import com.f6car.base.test.base.BaseTest;
import com.f6car.base.test.util.MockTestUtil;
import com.f6car.base.vo.user.TbUserVo;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import java.math.BigInteger;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class TbUserControllerTest extends BaseTest {
    private String pkId = "1";

    @Test
    public void testCRUD() throws Exception {
        TbUserVo tbUser = MockTestUtil.getJavaBean(TbUserVo.class);
        tbUser.setPkId(new BigInteger(pkId));
        RequestBuilder request;
        //delete
        request = delete("/user/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //add
        request = post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(tbUser));
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //get
        request = get("/user/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andExpect(jsonPath("data.pkId").value(pkId))
                .andReturn();
        request = get("/user");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();

        //update
        tbUser = MockTestUtil.getJavaBean(TbUserVo.class);
        tbUser.setPkId(new BigInteger(pkId));
        request = put("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(tbUser));
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //get
        request = get("/user/" + pkId);
        MvcResult mvcResult = mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andExpect(jsonPath("data.pkId").value(pkId))
                .andReturn();

        //delete
        request = delete("/user/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();

    }

}
