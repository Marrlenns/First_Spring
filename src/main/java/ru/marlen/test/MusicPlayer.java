package ru.marlen.test;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Plyaing: " + music.getSong() );
    }
}
