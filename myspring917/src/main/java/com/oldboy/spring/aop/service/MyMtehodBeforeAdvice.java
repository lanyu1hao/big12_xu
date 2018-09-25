package com.oldboy.spring.aop.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyMtehodBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("hello world");
    }
}
