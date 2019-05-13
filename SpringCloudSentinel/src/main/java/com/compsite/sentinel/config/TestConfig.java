package com.compsite.sentinel.config;

import org.springframework.context.annotation.PropertySource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@PropertySource("classpath:default.properties")
public class TestConfig {

    public static String getId() {
        Properties properties = getProperties("default.properties");
        String id = properties.getProperty("id");
        return id;
    }

    public static Properties getProperties(String fileName) {
        try {
            //先读取config目录的，没有再加载classpath的
            String outPath = System.getProperty("user.dir") + File.separator + "config" + File.separator;
            System.out.println(outPath);
            Properties properties = new Properties();
            InputStream in = new FileInputStream(new File(outPath + fileName));
            properties.load(in);
            return properties;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            try {
                Properties properties = new Properties();
                //默认加载classpath的
                InputStream in = TestConfig.class.getClassLoader().getResourceAsStream(fileName);
                properties.load(in);
                return properties;
            } catch (IOException es) {
                System.out.println(es.getMessage());
                return null;
            }
        }
    }
}
