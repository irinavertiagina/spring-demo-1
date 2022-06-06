package ru.irina.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        //Player player = new Player(music);
        Player player = context.getBean("playerBean", Player.class);
        player.play();
        context.close();
    }
}
