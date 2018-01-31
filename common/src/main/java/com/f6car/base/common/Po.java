/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.common;

import se.spagettikod.optimist.Identity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author qixiaobo
 */
public class Po<PK extends java.io.Serializable> implements java.io.Serializable {
    private static final long serialVersionUID = 5350639685728778721L;
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @Identity("id")
    @GeneratedValue(strategy = IDENTITY)
    private PK id;


    /**
     * 创建日期
     */
    private Date creationtime;

    /**
     * 修改日期
     */
    private Date modifiedtime;

    /**
     * 创建人
     */
    private BigInteger creator;

    /**
     * 修改人
     */
    private BigInteger modifier;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }


    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public BigInteger getCreator() {
        return creator;
    }

    public void setCreator(BigInteger creator) {
        this.creator = creator;
    }

    public BigInteger getModifier() {
        return modifier;
    }

    public void setModifier(BigInteger modifier) {
        this.modifier = modifier;
    }
}
