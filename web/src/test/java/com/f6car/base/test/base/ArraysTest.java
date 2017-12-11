/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.test.base;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.internal.util.collections.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArraysTest {

    @Test
    public void testAsList0() {
        Set<String> set = Sets.newSet("a", "b", "c");

        List strList = Arrays.asList(set);

    }

    @Test
    public void testAsList1() {
        Set<String> set = Sets.newSet("a", "b", "c");
        List<Set<String>> strSetList = Arrays.asList(set);

    }

    @Test
    public void testAsList2() {
        String[] strs;
        strs = new String[]{"a", "b", "c"};
        List strings = Arrays.asList(strs);
        Assert.assertEquals(strings.size(), 3);

    }

    @Test
    public void testAsList3() {
        Object strs;
        strs = new String[]{"a", "b", "c"};
        List strings = Arrays.asList(strs);
        Assert.assertEquals(strings.size(), 1);

    }


    @Test(expected = UnsupportedOperationException.class)
    public void testAsList4() {
        List<String> list = Arrays.asList("1", "2", "3");
        list.add("4");

    }

    @Test(expected = ClassCastException.class)
    public void testAsList5() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List list2 = list;
        list2.add("1223");
        for (Integer integer : list) {
            System.out.println(integer);
        }


    }

    @Test
    public void testAsList6() {
        Object strs;
        strs = new String[]{"a", "b", "c"};
        List strings = Arrays.asList((String[]) strs);
        Assert.assertEquals(strings.size(), 3);

    }

}
