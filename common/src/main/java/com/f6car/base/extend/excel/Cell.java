/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.extend.excel;

import java.io.Serializable;

/**
 * @author qixiaobo
 */
public class Cell implements Serializable {

    private static final long serialVersionUID = 855114474160322863L;
    private int width;
    private String name;

    public Cell(String name) {
        this(name, 1);
    }

    public Cell(String name, int width) {
        setName(name);
        setWidth(width);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("cell width must bigger than 0 ");
        }
        this.width = width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cell{");
        sb.append("width=").append(width);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
