package com.oldboy.spring.aop.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("apo.xml");
        WelcomeService ws = (WelcomeService) ac.getBean("welcomeService");

        ws.sayHello("haha");
    }
}
