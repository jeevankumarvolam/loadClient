package com.example.coreDbPerformance.service;

import com.example.coreDbPerformance.pojo.Player;
import com.example.coreDbPerformance.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class StartGameService {
    @Autowired
    PlayerRepository playerRepository;



    @Autowired
    PlayerCreationService playerCreationService;

    public void startGame() throws InterruptedException {
    List<Player> players=playerRepository.getUsers("");



int index=-1;
int i=0;
 while(i< players.size()/2){
     Player player1=players.get(index);
     Player player2=players.get(index+1);

     GameJoinService gameJoinService1=new GameJoinService(player1,player2);
     gameJoinService1.start();
     index=index+2;
     i++;

          }
    }


}
