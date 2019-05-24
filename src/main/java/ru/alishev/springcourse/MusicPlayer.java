package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
        // Домашнее задание после урока 6 - модификация кода
    // private Music music;

    // Урок 6: Внедрение зависимостей. Dependency Injection (DI)
    private String name;
    private int volume;

    //IoC - Inversion of Control
        // Домашнее задание после урока 6 - модификация кода
    /*
    public MusicPlayer(Music music) {
        this.music = music;
    }
    */
    // Урок 6: Внедрение зависимостей. Dependency Injection (DI) - Конструктор без аргументов
    public MusicPlayer() {

    }

    // Урок 6: Внедрение зависимостей. Dependency Injection (DI)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
        // Домашнее задание после урока 6 - модификация кода
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList() {
        for (Music music: musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    // Урок 6: Внедрение зависимостей. Dependency Injection (DI)
        // Домашнее задание после урока 6 - модификация кода

    /* public void setMusic(Music music) {
        this.music = music;
    }*/

        // Домашнее задание после урока 6 - модификация кода
    /*
    public void playMusic() {

        System.out.println("Playing: " + music.getSong());
    }*/
}
