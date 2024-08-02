package com.github.phoswald.sample.cdi.se;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

import org.jboss.weld.environment.se.Weld;

@Dependent
public class Application {

    @Inject
    private GreeterBean greeter;
    
    @Inject
    private StateBean state;
    
    public static void main(String[] args) {
        System.out.println(run(args));
    }

    static String run(String... args) {
        // shutdown hook is registered automatically for WeldContainer
        new Weld().enableDiscovery().initialize();
        
        String name = args.length == 0 ? "stranger" : args[0];
        Application instance = CDI.current().select(Application.class).get();
        return instance.sayHello(name);
    }
    
    private String sayHello(String name) {
        state.setName(name);
        return greeter.sayHello();
    }
}
