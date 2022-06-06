package ru.irina.spring;

import java.util.ArrayList;
import java.util.List;

public class Player {
    Music music;
    List<Music> musicList = new ArrayList<>();
    String name;
    int volume;
    //IoC
    Player(Music music){
        this.music = music;
    }
    Player(){}

    public Player(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
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
    public void playList(){
       for(Music m : musicList){
           System.out.println(m.getSong());
       }
    }
}
