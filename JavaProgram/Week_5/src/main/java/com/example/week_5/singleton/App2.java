package com.example.week_5.singleton;

public class App2 {
    private LogFile log = LogFile.getInstance();

    App2() {
        System.out.println( "App2 is created: " + log );
    }

    public void doSomething(String something) {
        log.INFO(something + " happen.");
    }

}