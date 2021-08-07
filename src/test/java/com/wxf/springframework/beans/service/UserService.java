package com.wxf.springframework.beans.service;

public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(" userService print() has bean called...");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        return sb.toString();
    }
}
