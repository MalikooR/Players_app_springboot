package com.malikoo.family.service;

import com.malikoo.family.entity.Player;

import com.malikoo.family.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {
    @Autowired
    PlayerRepo repo;

    @Override
    public Player getPlayerByFirstName(String firstname) {
        return repo.findByFirstName(firstname);
    }

    @Override
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    @Override
    public Player savePlayer(Player player) {
        return repo.save(player);
    }
}
