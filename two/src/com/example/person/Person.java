package com.example.person;

import java.util.logging.Logger;

public class Person {

    public void log() {

        Logger log = Logger.getLogger(Person.class.getName());

        log.info(Person.class.getName());
    }
}
