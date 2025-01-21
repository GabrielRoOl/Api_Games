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

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();

        //List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        //return dto;

        return result.stream().map(GameMinDTO::new).toList();

    }
}
