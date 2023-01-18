package com.example.coreDbPerformance.service;

import com.example.coreDbPerformance.pojo.Player;
import com.example.coreDbPerformance.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class StartGameService {
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    GameJoinService gameJoinService;

    @Autowired
    PlayerCreationService playerCreationService;

    public void startGame() {
        int i=0;
        ExecutorService executorService= Executors.newFixedThreadPool(60);
     while(i<10){
        executorService.execute(() -> {
            Player player1=playerCreationService.createPlayers(new Player());
            Player player2=playerCreationService.createPlayers(new Player());
            Player player3=playerCreationService.createPlayers(new Player());
        while(true) {
                gameJoinService.setChips(player1,player2,player3);

          }
    });
        i++;
        }
    }
}
