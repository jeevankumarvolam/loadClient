package com.example.coreDbPerformance.service;

import com.example.coreDbPerformance.pojo.Player;
import com.example.coreDbPerformance.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;


public class GameJoinService extends Thread{
   Player player1;
   Player player2;


    public GameJoinService(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }


   public void run(){




   }




}
