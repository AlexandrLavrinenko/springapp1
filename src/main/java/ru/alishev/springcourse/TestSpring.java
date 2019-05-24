package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // System.out.println(music.getName());                     // Only lesson 1

        // Music music = context.getBean("musicBean", Music.class); // For lesson 4
        // MusicPlayer musicPlayer = new MusicPlayer(music);        // For lesson 4

        // Проверяем работу Scope Singleton и Prototype
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);    // Lesson 5 (DI)
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);    // Lesson 5 (DI)

        boolean comparison =  firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

//        musicPlayer.playMusic();

        // Домашнее задание после урока 6 - модификация кода
        // musicPlayer.playMusicList();


        // Урок 6: Внедрение зависимостей. Dependency Injection (DI). Часть 2
        /*System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        context.close();    // !!!
    }
}
