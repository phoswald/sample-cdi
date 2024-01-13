package com.github.phoswald.sample.cdi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.inject.Inject;

import org.jboss.weld.junit5.auto.WeldJunit5AutoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(WeldJunit5AutoExtension.class)
class SampleBeanTest {

    @Inject
    private SampleBean testee;
    
    @Inject
    private ConfigurationBean configuration;

    @Test
    void sayHello_valid_success() {
        configuration.setName("tester");
        assertEquals("Hello, tester!", testee.sayHello());
    }
}
