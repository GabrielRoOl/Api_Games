package br.com.devsuperior.api_games.services;

import br.com.devsuperior.api_games.dto.GameMinDTO;
import br.com.devsuperior.api_games.entities.Game;
import br.com.devsuperior.api_games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        // List<Game> result = gameRepository.findAll();
        // var result = gameRepository.findAll();
        // return result;
        return gameRepository.findAll();
    }
}
