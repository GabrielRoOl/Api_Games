package br.com.devsuperior.api_games.controllers;

import br.com.devsuperior.api_games.dto.GameMinDTO;
import br.com.devsuperior.api_games.entities.Game;
import br.com.devsuperior.api_games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        // List<GameMinDTO> result = gameService.findAll();
        // var result = gameService.findAll();
        // return result;
        return gameService.findAll();
    }
}
