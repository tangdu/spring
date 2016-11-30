/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.tm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author tangdu
 * @version $Id: IndexController.java, v 0.1 2016年11月30日 下午3:19:52 tangdu Exp $
 */
@Controller
public class IndexController {

    @RequestMapping("/simple")
    @ResponseBody
    public String simple(String name) {
        return "我是中国人";
    }

    @RequestMapping(path = "/index")
    public String index() {
        return "index";
    }
}
