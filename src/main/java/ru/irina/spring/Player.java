package ru.irina.spring;

public class Player {
    Music music;
    String name;
    int volume;
    //IoC
    Player(Music music){
        this.music = music;
    }
    Player(){}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void play(){
        System.out.println(music.getSong());
    }
}
