package com.shittygamer.mrtheplague;

public class Main {
    public static void main(String[] args) {
        (new Thread(new Chat())).start();
        (new Thread(new Gibson())).start();
    }
}
