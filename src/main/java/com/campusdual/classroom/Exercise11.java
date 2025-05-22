package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.turnOn();
        System.out.println(" ------- Subir de canal ------------");
        redRemote.channelUp();
        redRemote.channelUp();
        System.out.println(redRemote.channel);
        System.out.println(" ------- Bajar de canal ------------");
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        System.out.println(" ------- Establecer canal a 0 ------------");
        redRemote.channel = 0;
        System.out.println(redRemote.channel);
        System.out.println(" ------- Bajar de canal ------------");
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        blackRemote.turnOn();
        System.out.println(" ------- Subir volumen ------------");
        blackRemote.volumeUp();
        blackRemote.volumeUp();
        System.out.println(blackRemote.volume);
        System.out.println(" ------- Bajar volumen ------------");
        blackRemote.volumeDown();
        System.out.println(blackRemote.volume);
        System.out.println(" ------- Establecer volumen a 0 ------------");
        blackRemote.volume = 0;
        System.out.println(" ------- Bajar volumen ------------");
        blackRemote.volumeDown();
        System.out.println(blackRemote.volume);
        System.out.println(" ------- Color mando ------------");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.turnOff();
        blackRemote.turnOff();
    }

}