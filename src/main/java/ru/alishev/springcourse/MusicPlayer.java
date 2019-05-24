package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;

    // Урок 6: Внедрение зависимостей. Dependency Injection (DI)
    private String name;
    private int volume;

    //IoC - Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

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

    // Урок 6: Внедрение зависимостей. Dependency Injection (DI)
     public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
