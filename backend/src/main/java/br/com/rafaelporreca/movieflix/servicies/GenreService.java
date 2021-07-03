package br.com.rafaelporreca.movieflix.servicies;

import br.com.rafaelporreca.movieflix.dto.GenreDTO;
import br.com.rafaelporreca.movieflix.entities.Genre;
import br.com.rafaelporreca.movieflix.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreService {

    private GenreRepository repository;

    @Autowired
    public GenreService(GenreRepository repository) {
        this.repository = repository;
    }

    public List<GenreDTO> listAllGenre(){
        List<GenreDTO> listDto = new ArrayList<>();
        List<Genre> list = repository.findAll();
        listDto = list.stream().map(obj -> new GenreDTO(obj)).collect(Collectors.toList());
        return listDto;
    }
}
