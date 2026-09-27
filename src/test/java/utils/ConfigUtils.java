package utils;


public class ConfigUtils {

    public static String getUrl(){
        return ConfigReader.getProperty("url");
    }

    public static String getUsername(){
        return ConfigReader.getProperty("username");
    }

    public static String getPassword(){
        return ConfigReader.getProperty("password");
    }

    public static String getFirstName(){
        return ConfigReader.getProperty("firstname");
    }

    public static String getLastName(){
        return ConfigReader.getProperty("lastname");
    }

    public static String getPostalCode(){
        return ConfigReader.getProperty("postalCode");
    }
}
