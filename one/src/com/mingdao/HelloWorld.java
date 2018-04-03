package com.mingdao;

import com.example.person.Person;

import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String[] arg) {

        Person person = new Person();
        person.log();

        Logger log = Logger.getLogger(HelloWorld.class.getName());
        log.info(HelloWorld.class.getName());

        System.out.println("HelloWorld");
    }
}
