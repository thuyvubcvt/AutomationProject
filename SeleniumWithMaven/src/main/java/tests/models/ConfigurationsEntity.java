package tests.models;

import common.Configurations;

public class ConfigurationsEntity {
    public String url;
    public String timeOutMedium;
    public String timeOutLong;

    public ConfigurationsEntity(String configFile) {
        Configurations configurations=new Configurations(configFile);
        url=configurations.getConfigValueByKey("URL");
        timeOutMedium=configurations.getConfigValueByKey("TIME_OUT_MEDIUM");
        timeOutLong=configurations.getConfigValueByKey("TIME_OUT_LONG");
    }
}
