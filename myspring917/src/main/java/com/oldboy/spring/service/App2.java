package com.oldboy.spring.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ByeService bs = (ByeService) ac.getBean("byeService");
        bs.sayBye();
    }


}
