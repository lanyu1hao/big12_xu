package com.oldboy.spring.service;

public class ByeServiceImpl implements ByeService {
    private String bye;

    public String getBye() {
        return bye;
    }

    public void setBye(String bye) {
        this.bye = bye;
    }

    public void sayBye() {
        System.out.println(bye);
    }
}
