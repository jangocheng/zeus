/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.service.impl.insurance;

import com.f6car.base.core.AbstractService;
import com.f6car.base.dao.insurance.TsInsuranceAttachmentMapper;
import com.f6car.base.po.insurance.TsInsuranceAttachment;
import com.f6car.base.service.insurance.TsInsuranceAttachmentService;
import com.f6car.base.so.insurance.TsInsuranceAttachmentSo;
import com.f6car.base.vo.insurance.TsInsuranceAttachmentVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by qixiaobo on 2018-02-01.
 */
@Service
@Transactional(rollbackFor = Exception.class, timeout = 1)
public class TsInsuranceAttachmentServiceImpl extends AbstractService<TsInsuranceAttachment, TsInsuranceAttachmentVo, TsInsuranceAttachmentSo, Integer> implements TsInsuranceAttachmentService {
    @Resource
    private TsInsuranceAttachmentMapper tsInsuranceAttachmentMapper;

    @Resource
    private TsInsuranceAttachmentService self;
}
