package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Music music = context.getBean("musicBean", Music.class); // For lesson 4
        // MusicPlayer musicPlayer = new MusicPlayer(music);        // For lesson 4

        // System.out.println(music.getName());                     // Only lesson 1

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);    // Lesson 5 (DI)

        musicPlayer.playMusic();

        context.close();    // !!!
    }
}
