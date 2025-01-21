package br.com.devsuperior.api_games.services;

import br.com.devsuperior.api_games.dto.GameDTO;
import br.com.devsuperior.api_games.dto.GameMinDTO;
import br.com.devsuperior.api_games.entities.Game;
import br.com.devsuperior.api_games.projections.GameMinProjection;
import br.com.devsuperior.api_games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }


    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchGameList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
