package br.com.devsuperior.api_games.dto;

import br.com.devsuperior.api_games.entities.Game;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(){}

    public GameDTO(Game game) {
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        genre = game.getGenre();
        platforms = game.getPlatforms();
        score = game.getScore();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
        longDescription = game.getLongDescription();
        // BeanUtils.copyProperties(game, this);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
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
