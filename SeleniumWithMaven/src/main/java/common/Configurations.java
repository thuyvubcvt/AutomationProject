package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Configurations {
    String configFile;
    public Configurations(String configFile) {
        this.configFile = configFile;
    }

    public String getConfigValueByKey(String configName){
        String configValue="";
        try {
            InputStream inputStream=new FileInputStream(configFile);
            System.out.println("in ra"+configFile);
            Properties properties=new Properties();
            properties.load(inputStream);
            configValue=properties.getProperty(configName);

        } catch (Exception e) {
            System.out.println("Configurations file not found");
        }
        return configValue;
    }
}
