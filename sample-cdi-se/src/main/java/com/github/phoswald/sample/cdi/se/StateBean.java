package com.github.phoswald.sample.cdi.se;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
class StateBean {
    
    private String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
