package com.github.phoswald.sample.cdi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.inject.Inject;

import org.jboss.weld.junit5.auto.WeldJunit5AutoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(WeldJunit5AutoExtension.class)
class GreeterBeanTest {

    @Inject
    private GreeterBean testee;
    
    @Inject
    private StateBean state;

    @Test
    void sayHello_valid_success() {
        state.setName("tester");
        assertEquals("Hello, tester!", testee.sayHello());
    }
}
