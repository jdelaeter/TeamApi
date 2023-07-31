package fr.badmintonLeDoulieu.api.service;

import fr.badmintonLeDoulieu.api.Entity.PlayerEntity;
import fr.badmintonLeDoulieu.api.Entity.TeamEntity;
import fr.badmintonLeDoulieu.api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerEntity> findAll(){
        return playerRepository.findAll();
    }

    public PlayerEntity findById(Long id){
        Optional<PlayerEntity> result = playerRepository.findById(id);

        PlayerEntity playerEntity = null;

        if(result.isPresent()){
            playerEntity = result.get();
        }
        else{
            throw new RuntimeException("Il y a pas Id :(" + id);
        }
        return playerEntity;
    }

    public PlayerEntity insertTeam(PlayerEntity playerEntity){
        return playerRepository.save(playerEntity);
    }

    public void deleteById(Long deleteId){
        playerRepository.deleteById(deleteId);
    }
}