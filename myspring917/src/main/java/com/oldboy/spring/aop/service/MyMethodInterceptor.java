package com.oldboy.spring.aop.service;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor{

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法前");
        Object obj = methodInvocation.proceed();
        System.out.println("方法后");



        return obj;
    }
}
