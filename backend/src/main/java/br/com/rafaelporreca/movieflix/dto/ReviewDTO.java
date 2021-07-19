package br.com.rafaelporreca.movieflix.dto;

import br.com.rafaelporreca.movieflix.entities.Review;
import br.com.rafaelporreca.movieflix.entities.User;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ReviewDTO implements Serializable{

    private Long id;
    @NotBlank(message = "Campo obrigatório")
    private String text;
    private Long movieId;
    private UserDTO user;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String text, Long movieId, UserDTO user) {
        this.id = id;
        this.text = text;
        this.movieId = movieId;
        this.user = user;
    }
    public ReviewDTO(Review obj) {
        id = obj.getId();
        text = obj.getText();
        movieId = obj.getMovie().getId();
    }

    public ReviewDTO(Review obj, User user) {
        this(obj);
        this.user = new UserDTO(user);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
