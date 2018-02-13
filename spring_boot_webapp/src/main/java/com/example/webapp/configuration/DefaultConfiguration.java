package com.example.webapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by guoming3 on 2018/2/13.
 */
@Configuration
public class DefaultConfiguration {

    @Configuration
    @Profile("prod")
    @PropertySource("classpath:common.properties")
    static class Production{

    }
    @Configuration
    @Profile("dev")
    @PropertySource("classpath:dev.properties")
    static class Development{

    }
}
