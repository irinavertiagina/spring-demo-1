package ru.irina.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Player {
    Music music;
    List<Music> musicList = new ArrayList<>();
    @Value("${props.name}")
    String name;

   @Value("${props.value}")
    int volume;
    //IoC
    @Autowired
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

    public void getName() {
        System.out.println(name);
    }

    public void getVolume() {
        System.out.println(volume);
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
