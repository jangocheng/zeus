/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.test.base;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    @Test(expected = UnsupportedOperationException.class)
    public void testEmptyCollections() {
        List<Integer> userList = Collections.emptyList();
        userList.add(1);
    }

    @Test
    public void testToArray() {
        List<String> list = Lists.newArrayList("1", "2", "3");
        Object[] objects = list.toArray();
    }

    @Test
    public void testToArray2() {
        List<String> list = Lists.newArrayList("1", "2", "3");
        String[] strings = list.toArray(new String[list.size()]);
    }

}
