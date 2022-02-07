package com.malikoo.family.controllers;

import com.malikoo.family.entity.Player;
import com.malikoo.family.request.PlayerRequest;
import com.malikoo.family.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.List;

@RestController
@RequestMapping("api/player/v1")
public class PlayersController {

    @Autowired
    ServiceImpl service;

    @GetMapping("/fam")
    public String test(ServletRequest req, ServletResponse res){
        return "This is a test";
    }

    @PostMapping("/add")
    public ResponseEntity<Player> addNewPlayer(@RequestBody Player playerRequest){
        return ResponseEntity.ok().body(service.savePlayer(playerRequest));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Player>> getAllPlayers(){

        return ResponseEntity.ok().body(service.getAllPlayers());
    }
}
