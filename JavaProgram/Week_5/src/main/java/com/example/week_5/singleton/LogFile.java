package com.example.week_5.singleton;

public class LogFile {
    // reference variable to store logfile object
    private static LogFile instance = null;

    // attribute
    private String log = "";

    // Private Constructor = Other class cannot instantiate! :o
    private LogFile() {
    }

    public static LogFile getInstance() {
        // If instance is null, create LogFile object
        if (instance == null) {
            instance = new LogFile();
        }
        return instance;
    }

    // Record INFO activity in logfile
    public void INFO(String msg) {
        log += "\n" + msg;
    }

    public void printLog(){
        System.out.println(log);
    }

}

