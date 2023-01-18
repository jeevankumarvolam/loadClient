package com.example.coreDbPerformance.service;

import com.example.coreDbPerformance.pojo.Player;
import com.example.coreDbPerformance.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EndGameService {
    @Autowired
    PlayerRepository playerRepository;


    public void declareWinner(Player player1,Player player2,Player player3)
    {
        List<Player> players=new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        Collections.sort(players);
        players.get(2).setWinningMatchesCount(players.get(2).getWinningMatchesCount()+1);
        playerRepository.save(player1);
        playerRepository.save(player2);
        playerRepository.save(player3);



    }


}
