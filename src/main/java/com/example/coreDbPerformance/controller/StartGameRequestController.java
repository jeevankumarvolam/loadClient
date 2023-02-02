package com.example.coreDbPerformance.controller;

import com.example.coreDbPerformance.repository.PlayerRepository;
import com.example.coreDbPerformance.service.PlayerCreationService;
import com.example.coreDbPerformance.service.StartGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartGameRequestController {
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerCreationService playerCreationService;

    @Autowired
    StartGameService startGameService;

    @RequestMapping("/startGames")
    public String sendGameStartRequest() throws InterruptedException {


playerRepository.leaveTable("atTable","tableId",
        "userName","tableId",0.00d,"userCode",
        1,"subGameType",1,"subGameType",
        1L,0.00,0.0,0.0,
        0.0,0.0);

        return "Your request is being processed";

    }


}
