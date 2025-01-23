package br.com.devsuperior.api_games.dto;

import br.com.devsuperior.api_games.entities.Game;
import br.com.devsuperior.api_games.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){}

    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
        this.title = projection.getTitle();
        this.year = projection.getGameYear();
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.title = entity.getTitle();
        this.year = entity.getYear();
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
