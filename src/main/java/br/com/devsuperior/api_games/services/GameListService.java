package br.com.devsuperior.api_games.services;

import br.com.devsuperior.api_games.dto.GameDTO;
import br.com.devsuperior.api_games.dto.GameListDTO;
import br.com.devsuperior.api_games.dto.GameMinDTO;
import br.com.devsuperior.api_games.entities.Game;
import br.com.devsuperior.api_games.entities.GameList;
import br.com.devsuperior.api_games.repositories.GameListRepository;
import br.com.devsuperior.api_games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
