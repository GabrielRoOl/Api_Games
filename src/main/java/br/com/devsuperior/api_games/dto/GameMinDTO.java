package br.com.devsuperior.api_games.dto;

import br.com.devsuperior.api_games.entities.Game;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){}

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
