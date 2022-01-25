package com.prowings;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements ApplicationContextAware {

    int roll;
    String name;
    Address address;
    private ApplicationContext applicationContext;
    public Student() {
    }

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return applicationContext.getBean("address",Address.class);
    }

    public void setAddress(Address address) {
//        System.out.println("setting addr via setter");

        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
//        System.out.println("setting roll no via setter");
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        System.out.println("setting name no via setter");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
