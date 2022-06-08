package ru.irina.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Music musicBean = context.getBean("blackMusic", Music.class);
        Player playerBean = context.getBean("player", Player.class);
        playerBean.setMusic(musicBean);//old-way dependency injection(music is a dependency for player)

        playerBean.play();
        context.close();
    }
}
