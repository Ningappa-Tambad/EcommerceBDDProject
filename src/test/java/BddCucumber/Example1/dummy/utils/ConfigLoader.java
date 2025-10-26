package BddCucumber.Example1.dummy.utils;

import BddCucumber.Example1.dummy.constants.EnvType;

import java.util.Properties;

public class ConfigLoader {

    //Single ton design pattern
    private Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader()
    {
        properties = new Properties();

          String env=  System.getProperty("env", String.valueOf(EnvType.STAGE));

            switch (EnvType.valueOf(env))
            {
                case DEV:
                    properties=PropertyUtils.loadProperties("src/test/java/BddCucumber/Example1/dummy/config/dev_config.properties");
                    break;
                case QA:
                    properties=PropertyUtils.loadProperties("src/test/java/BddCucumber/Example1/dummy/config/qa_config.properties");
                    break;
                case PROD:
                    properties=PropertyUtils.loadProperties("src/test/java/BddCucumber/Example1/dummy/config/prod_config.properties");
                    break;
                case STAGE:
                    properties=PropertyUtils.loadProperties("src/test/java/BddCucumber/Example1/dummy/config/stage_config.properties");
                    break;
                default:
                    throw new RuntimeException("Invalid env type "+env+" passed! Please pass the correct env type");
            }
    }

    public static ConfigLoader getInstance()
    {
        if(configLoader == null)
        {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl()
    {
        String prop=properties.getProperty("baseUrl");
        if(prop!=null) return prop;
        else throw new RuntimeException("property baseUrl is not specified in the config.properties file");
    }

}
