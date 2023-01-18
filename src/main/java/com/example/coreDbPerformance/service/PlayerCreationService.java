package com.example.coreDbPerformance.service;

import com.example.coreDbPerformance.constants.PlayerConstants;
import com.example.coreDbPerformance.pojo.Player;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PlayerCreationService {

    private int objectCreated = 0;


    public Player createPlayers(Player player) {


        Random random = new Random();

        synchronized (player) {
           // player.setPlayerId(PlayerConstants.PLAYER_ID_PREFIX + objectCreated);

            player.setPlayerName(PlayerConstants.PLAYER_NAME_PREFIX + objectCreated);
            player.setPlayerSource(PlayerConstants.SOURCE_NAME_PREFIX + objectCreated);
            player.setDevice_id(PlayerConstants.DEVICE_ID_PREFIX + objectCreated);
            player.setA23PanName(PlayerConstants.A23_PAN_NAME_PREFIX + objectCreated);
            player.setA23PanNumber(PlayerConstants.A23_PAN_NUMBER_PREFIX + objectCreated);
            player.setChips(random.nextInt(100000));

            objectCreated++;
            return player;

        }


    }


}
