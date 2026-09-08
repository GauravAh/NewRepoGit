package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;
    public ConfigReader(){
        properties = new Properties();
        InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config/global.properties");
        if(input == null){
            throw new RuntimeException("Config File Missing under resources folder");
        }
        try {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyValue(String val){
        return properties.getProperty(val);
    }
}
