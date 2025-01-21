package br.com.devsuperior.api_games.repositories;

import br.com.devsuperior.api_games.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

}