package ru.alishev.springcourse;

public class MusicPlayer {

    private Music music;

    //IoC - Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    // Урок 6: Внедрение зависимостей. Dependency Injection (DI)
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
