package com.github.phoswald.sample.cdi.test;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
class GreeterBean {
    
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Inject
    private StateBean state;
    
    String sayHello() {
        logger.info("Saying hello, state.name={}", state.getName());
        return "Hello, " + state.getName() + "!";
    }
}
