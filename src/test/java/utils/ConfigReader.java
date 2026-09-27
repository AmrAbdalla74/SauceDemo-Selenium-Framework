package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    public static void loadProperties(){

        properties = new Properties();

        try (
                FileInputStream file =
                        new FileInputStream("src/test/java/config/config.properties")) {

            properties.load(file);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
