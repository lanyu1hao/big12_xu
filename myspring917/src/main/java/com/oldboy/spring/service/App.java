package com.oldboy.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//        WelcomeServiceImpl ws= (WelcomeServiceImpl) ac.getBean("welcomeService");


       // ws.sayHello();
//        ByeService sb = (ByeService) ac.getBean("byeService");
//        sb.sayBye();


        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml") ;
        WelcomService ws = (WelcomService) ac.getBean("welcomeService");
        ws.sayHello();

//        ws = (WelcomService) ac.getBean("welcomeService");
//        ws.sayHello();
//
//        ByeService bs = (ByeService) ac.getBean("byeService");
//        bs.sayBye();
    }
}
