package com.github.phoswald.sample.cdi.test;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
class ConfigurationBean {
    
    private String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
