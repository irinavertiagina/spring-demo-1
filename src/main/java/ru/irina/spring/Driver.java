package ru.irina.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class Driver {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                JavaConfig.class
        );
        Music musicBean = context.getBean("blackMusic", Music.class);
        Player playerBean = context.getBean("player", Player.class);
       // playerBean.setMusic(musicBean);//old-way dependency injection(music is a dependency for player)

        playerBean.getName();
        playerBean.getVolume();
        context.close();
    }
}
