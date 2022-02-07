package com.malikoo.family.service;

import com.malikoo.family.entity.Player;

import java.util.List;

public interface IService {

     Player getPlayerByFirstName(String firstname);
     List<Player> getAllPlayers();
     Player savePlayer(Player person);
}
