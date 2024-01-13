package com.github.phoswald.sample.cdi.se;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplicationTest {
    
    @Test
    void run_valid_success() {
        assertEquals("Hello, tester!", Application.run("tester"));
    }
}
