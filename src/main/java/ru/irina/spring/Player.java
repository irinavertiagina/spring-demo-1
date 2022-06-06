package ru.irina.spring;

public class Player {
    Music music;

    Player(Music music){
        this.music = music;
    }

    public void play(){
        System.out.println(music.getSong());
    }
}
