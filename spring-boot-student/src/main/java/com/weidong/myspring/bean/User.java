/**
 * Copyright (C), 2017-2017, 1130160475@qq.com
 * FileName: User
 * Author:   ${1130160475@qq.com}
 * Date:     2017/11/27 0027 下午 8:31
 * Description: 用户实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.weidong.myspring.bean;

import java.io.Serializable;

public class User implements Serializable{

    private Integer id;
    private Integer age;
    private String name;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}