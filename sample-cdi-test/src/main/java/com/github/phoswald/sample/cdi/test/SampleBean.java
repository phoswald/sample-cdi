package com.github.phoswald.sample.cdi.test;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
class SampleBean {
    
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Inject
    private ConfigurationBean configuration;
    
    String sayHello() {
        logger.info("Saying hello, configuration={}", configuration.getName());
        return "Hello, " + configuration.getName() + "!";
    }
}
