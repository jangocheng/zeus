/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.orika;

import com.air.tqb.model.TbUser;
import com.f6car.base.core.OrikaRegisty;
import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;

@Component
public class UserOrikaRegisty implements OrikaRegisty {
    /**
     * @param factory MapperFactory
     * @see <a href="http://orika-mapper.github.io/orika-docs/intro.html">文档</a>
     * @see com.f6car.base.core.OrikaMapper#orikaRegistyList
     */
    @Override
    public void register(MapperFactory factory) {
        factory.classMap(TbUser.class, com.f6car.base.po.user.TbUser.class)
                .field("pkId", "pkId")
                .byDefault()
                .register();
    }
}
