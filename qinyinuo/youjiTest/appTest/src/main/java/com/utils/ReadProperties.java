package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    static String filePath = "conf/config.properties";
    public static String getPropertyValue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(filePath);
        prop.load(fis);
        fis.close();
        return prop.getProperty(key);
    }

}
