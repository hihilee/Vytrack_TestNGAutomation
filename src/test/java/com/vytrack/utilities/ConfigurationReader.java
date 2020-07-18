package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //reads the config data.

    private static Properties properties;

    //we want config. data static, we want it to load first and can be called class name.
    static{

        try{
            FileInputStream fileInputStream=new FileInputStream("configuration.properties");
            properties=new Properties();
            properties.load(fileInputStream);
        }catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException("Config.data is not found!!");
        }

    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }













}
