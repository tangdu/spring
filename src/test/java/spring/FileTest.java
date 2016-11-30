/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package spring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

/**
 * TODO: detail description
 *
 * @name TODO: Chinese name
 * @author tangdu
 * @version $Id: FileTest.java, v 0.1 2016年11月30日 下午10:13:02 tangdu Exp $
 */
public class FileTest {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/temp?name=妙");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            byte a[] = new byte[1024];
            StringBuffer bf = new StringBuffer();
            while ((inputStream.read(a)) > 0) {
                bf.append(new String(a));
            }
            System.out.println(bf);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
