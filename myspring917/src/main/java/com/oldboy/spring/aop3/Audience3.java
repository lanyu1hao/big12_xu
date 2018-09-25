package com.oldboy.spring.aop3;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience3 {
    public Object watch(ProceedingJoinPoint pjp) {
        try {
            System.out.println("sitdown");
            System.out.println("turn off cellphone");

            //调用目标对象的方法
            Object obj = pjp.proceed();
            System.out.println("鼓掌 鼓掌");
            return obj;
        } catch (Throwable e) {
            System.out.println("退票");

            e.printStackTrace();
        }finally {
            System.out.println("回家");
        }
        return null;
    }
}
