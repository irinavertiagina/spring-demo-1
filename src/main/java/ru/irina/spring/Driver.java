package ru.irina.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean myBean =
                context.getBean("testBean", TestBean.class);
        System.out.println(myBean.getName());
    }
}
