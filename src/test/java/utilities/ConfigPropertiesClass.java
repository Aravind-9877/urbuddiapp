package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertiesClass {

    private static Properties properties = new Properties();

    static {
        try {
            FileReader file = new FileReader("./src/test/resources/config.properties");
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
