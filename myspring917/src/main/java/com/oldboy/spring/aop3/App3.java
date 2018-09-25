package com.oldboy.spring.aop3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("aop3.xml");
        Actor3 actor3 = (Actor3) cs.getBean("singer");
        actor3.show();
    }
}
