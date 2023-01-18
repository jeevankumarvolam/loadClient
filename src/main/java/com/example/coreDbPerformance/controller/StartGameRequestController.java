package com.example.coreDbPerformance.controller;

import com.example.coreDbPerformance.service.PlayerCreationService;
import com.example.coreDbPerformance.service.StartGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartGameRequestController {

    @Autowired
    PlayerCreationService playerCreationService;

    @Autowired
    StartGameService startGameService;

    @RequestMapping("/startGames")
    public String sendGameStartRequest() {

        startGameService.startGame();


        return "Your request is being processed";

    }


}
