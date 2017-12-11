/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.test.menu;

import com.alibaba.fastjson.JSON;
import com.f6car.base.test.base.BaseTest;
import com.f6car.base.test.util.MockTestUtil;
import com.f6car.base.vo.menu.TbMenuVo;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import java.math.BigInteger;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class TbMenuControllerTest extends BaseTest {
    private String pkId = "1";

    @Test
    public void testCRUD() throws Exception {
        TbMenuVo tbMenu = MockTestUtil.getJavaBean(TbMenuVo.class);
        tbMenu.setId(new BigInteger(pkId));
        RequestBuilder request;
        //add
        request = post("/menu")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(tbMenu));
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //get
        request = get("/menu/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andExpect(jsonPath("data.pkId").value(pkId))
                .andReturn();
        request = get("/menu");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();

        //update
        tbMenu = MockTestUtil.getJavaBean(TbMenuVo.class);
        tbMenu.setId(new BigInteger(pkId));
        request = put("/tbMenu")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(tbMenu));
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();
        //get
        request = get("/menu/" + pkId);
        MvcResult mvcResult = mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andExpect(jsonPath("data.pkId").value(pkId))
                .andReturn();

        //delete
        request = delete("/menu/" + pkId);
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("200"))
                .andExpect(jsonPath("message").value("SUCCESS"))
                .andReturn();

    }

}
