/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package spring;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * TODO: detail description
 *
 * @name TODO: Chinese name
 * @author tangdu
 * @version $Id: CommonUtilTest.java, v 0.1 2016年12月1日 上午8:23:58 tangdu Exp $
 */
public class CommonUtilTest {

    public static void main(String[] args) {
        String astr;
        try {
            astr = FileUtils.readFileToString(new File("/Users/tangdu/.m2/repository/archetype-catalog.xml"), "UTF-8");
            System.err.println(astr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
