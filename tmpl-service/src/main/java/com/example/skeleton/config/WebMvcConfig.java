package com.example.skeleton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.BeanValidationPostProcessor;

@Configuration
public class WebMvcConfig {

    //bean для валидации
    @Bean
    public BeanValidationPostProcessor beanValidationPostProcessor() {
        return new BeanValidationPostProcessor();
    }

}
