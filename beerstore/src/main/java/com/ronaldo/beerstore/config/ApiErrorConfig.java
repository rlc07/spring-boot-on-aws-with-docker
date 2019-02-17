package com.ronaldo.beerstore.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ApiErrorConfig {

    public MessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/api_errors");
        messageSource.setDefaultEncoding("UTF-8");

        return messageSource;
    }
}
