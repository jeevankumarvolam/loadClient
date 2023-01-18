package com.example.coreDbPerformance.service;

import org.springframework.beans.factory.annotation.Value;

public class ThreadService extends Thread {
    @Value("${player.count}")
    private int playerCount;


    public void run() {

        for (int i = 0; i < playerCount; i++) {


        }


    }


}
