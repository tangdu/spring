/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.tm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.tm.entity.UserInfo;

/**
 * 
 * @author tangdu
 * @version $Id: TempController.java, v 0.1 2016年11月30日 下午9:43:20 tangdu Exp $
 */
@Controller
public class TempController {

    @RequestMapping(path = { "/temp", "/temp1" })
    @ResponseBody
    public String test(String name) {
        return String.format("%s开发", name);
    }

    @RequestMapping(path = { "/add" },method=RequestMethod.POST)
    @ResponseBody
    public String test2(UserInfo userInfo) {
        return JSON.toJSONString(userInfo);
    }
}
