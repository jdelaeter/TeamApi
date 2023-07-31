package fr.badmintonLeDoulieu.api.controller;

import fr.badmintonLeDoulieu.api.Entity.PlayerEntity;
import fr.badmintonLeDoulieu.api.Entity.TeamEntity;
import fr.badmintonLeDoulieu.api.dto.PlayerDto;
import fr.badmintonLeDoulieu.api.dto.TeamDto;
import fr.badmintonLeDoulieu.api.service.PlayerService;
import fr.badmintonLeDoulieu.api.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<PlayerDto> gettingPlayers(){
        return playerService.findAll().stream().map(this::toDto).collect(toList());
    }

    private PlayerDto toDto(PlayerEntity playerEntity){
        return new PlayerDto(playerEntity.getId(),playerEntity.getName());
    }

    private PlayerEntity toEntity(PlayerDto playerDto){
        return new PlayerEntity(playerDto.id(),playerDto.name());
    }
}
