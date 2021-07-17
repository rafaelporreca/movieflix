package br.com.rafaelporreca.movieflix.dto;

import br.com.rafaelporreca.movieflix.entities.Movie;

public class MovieDTO {

    private Long id;
    private String title;
    private String subTitle;
    private Integer year;
    private String imgUrl;
    private String synopsis;
    private GenreDTO genreDto;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.year = year;
        this.imgUrl = imgUrl;
        this.synopsis = synopsis;
    }
    public MovieDTO(Movie obj) {
        id = obj.getId();
        title = obj.getTitle();
        subTitle = obj.getSubTitle();
        year = obj.getYear();
        imgUrl = obj.getImgUrl();
        synopsis = obj.getSynopsis();
        genreDto = new GenreDTO(obj.getGenre());
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public GenreDTO getGenreDto() {
        return genreDto;
    }
}
