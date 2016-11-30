/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.tm.entity;

import java.util.List;

/**
 * @author tangdu
 * @version $Id: UserInfo.java, v 0.1 2016年11月30日 下午10:27:50 tangdu Exp $
 */
public class UserInfo {

    private String       name;
    private Integer      age;

    private List<String> citys;

    public List<String> getCitys() {
        return citys;
    }

    public void setCitys(List<String> citys) {
        this.citys = citys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
