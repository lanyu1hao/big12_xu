package com.oldboy.spring.service;

public class WelcomeServiceImpl implements WelcomService{
    private String name;
    private ByeService bs;

    public ByeService getBs() {
        return bs;
    }

    public void setBs(ByeService bs) {
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello"+name);
    }
}
