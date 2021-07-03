package br.com.rafaelporreca.movieflix.dto;

import br.com.rafaelporreca.movieflix.entities.Genre;

public class GenreDTO {

    private Long id;
    private String name;

    public GenreDTO() {
    }

    public GenreDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public GenreDTO(Genre obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
