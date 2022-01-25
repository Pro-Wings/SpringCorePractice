package com.prowings;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inside main!!");

        ApplicationContext peronContext = new ClassPathXmlApplicationContext("PersonCollectionAppContext.xml");

        Person p1 = peronContext.getBean("person1",Person.class);
        System.out.println(p1);

        Student s1;
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        s1 = context.getBean("student1",Student.class);
        //s1 = (Student) context.getBean("student1");//Container created/managed object
        System.out.println("before change : "+s1);
        System.out.println(s1.hashCode());
        s1.getAddress().setCity("ZZZZZZ");
        System.out.println(s1.getAddress());

        System.out.println("s1 Address hascode : "+s1.getAddress().hashCode());
        System.out.println("after change : "+s1);

        Student s2  = context.getBean("student1",Student.class);
        System.out.println("s2 : "+s2);
        System.out.println("s2 Address hascode : "+s2.getAddress().hashCode());
        System.out.println(s2.hashCode());

        Student s3  = context.getBean("student2",Student.class);
        System.out.println("s3 before change : "+s3);
        System.out.println(s3);
        s3.setName("YYYY");
        System.out.println("s3 after change : "+s3);
        System.out.println(s3.hashCode());

        Student s4  = context.getBean("student2",Student.class);
        System.out.println(s4);
        System.out.println(s4.hashCode());
    }
}
