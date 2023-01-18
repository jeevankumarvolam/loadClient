package com.example.coreDbPerformance.service;

import com.example.coreDbPerformance.pojo.Player;
import com.example.coreDbPerformance.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameJoinService {
    @Autowired
    private  PlayerRepository playerRepository;

    @Autowired
    private  EndGameService endGameService;

    @Autowired
    private  PlayerCreationService playerCreationService;

    public void setChips(Player player1, Player player2, Player player3) {
        Random random = new Random();

        player1.setChips(random.nextInt());
        player2.setChips(random.nextInt());
        player3.setChips(random.nextInt());



        endGameService.declareWinner(player1,player2,player3);


    }

}
