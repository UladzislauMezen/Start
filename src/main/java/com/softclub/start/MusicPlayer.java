package com.softclub.start;

public class MusicPlayer {
    private static Music music;

    public MusicPlayer(Music music) {
        MusicPlayer.music = music;
    }

    public static void playMusic() {
        System.out.println("Playing" + " " + music.getSong());
    }
}
