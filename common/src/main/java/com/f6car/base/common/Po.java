/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.common;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author qixiaobo
 */
public class Po<T extends Serializable> implements java.io.Serializable {

    private static final long serialVersionUID = 5350639685728778721L;
    @Id
    private T pk;

    public T getPk() {
        return pk;
    }

    public void setPk(T pk) {
        this.pk = pk;
    }
}
