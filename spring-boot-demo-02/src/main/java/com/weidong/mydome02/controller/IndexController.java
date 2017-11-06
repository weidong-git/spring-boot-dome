/**
 * Copyright (C), 2017-2017, 1130160475@qq.com
 * FileName: IndexController
 * Author:   ${1130160475@qq.com}
 * Date:     2017/11/6 0006 下午 11:48
 * Description: 控制器.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.weidong.mydome02.controller;

import com.weidong.mydome02.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @Value(value = "${weidong.secret}")
    private String secret;

    @Value(value = "${weidong.number}")
    private int id;

    @Value(value = "${weidong.desc}")
    private String desc;

    @RequestMapping
    public String index() {
        return "hello world";
    }

    // @RequestParam 简单类型的绑定，可以出来get和post
    @RequestMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "hello world");
        map.put("name", name);
        map.put("secret", secret);
        map.put("id", id);
        map.put("desc", desc);
        return map;
    }

    // @PathVariable 获得请求url中的动态参数
    @RequestMapping(value = "/get/{id}/{name}")
    public User getUser(@PathVariable int id, @PathVariable String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setDate(new Date());
        return user;
    }
}