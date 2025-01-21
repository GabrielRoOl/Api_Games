package br.com.devsuperior.api_games.repositories;

import br.com.devsuperior.api_games.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}