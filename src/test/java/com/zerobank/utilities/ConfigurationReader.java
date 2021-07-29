package com.zerobank.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- Create property object
    private static Properties properties = new Properties();

    static {
        //2- Load the file into FileInputStream()
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            //3- load properties object with the file
            properties.load(file);

        } catch (IOException e) {
            System.out.println("File not found in Configuration properties.");
        }
    }
    //USE THE ABOVE CREATED LOGIC TO CREATE A RE_USABLE STATIC METHOD
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
