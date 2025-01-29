package com.softclub.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);
       // MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer.playMusic();
        context.close();
    }
}
