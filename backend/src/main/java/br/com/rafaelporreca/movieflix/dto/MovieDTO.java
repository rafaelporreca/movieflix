package br.com.rafaelporreca.movieflix.dto;

import br.com.rafaelporreca.movieflix.entities.Movie;
import br.com.rafaelporreca.movieflix.entities.Review;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MovieDTO {

    private Long id;
    private String title;
    private String subTitle;
    private Integer year;
    private String imgUrl;
    private String synopsis;
    private Long genreId;
    private List<ReviewDTO> reviews = new ArrayList<>();

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
        genreId = obj.getGenre().getId();
    }

    public MovieDTO(Movie obj, Set<Review> list) {
        this(obj);
        reviews = list.stream().map(review ->new ReviewDTO(review)).collect(Collectors.toList());
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

    public Long getGenreId() {
        return genreId;
    }

    public List<ReviewDTO> getReviews() {
        return reviews;
    }
}
