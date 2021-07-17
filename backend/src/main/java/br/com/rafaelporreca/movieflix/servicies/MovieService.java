package br.com.rafaelporreca.movieflix.servicies;

import br.com.rafaelporreca.movieflix.dto.MovieDTO;
import br.com.rafaelporreca.movieflix.entities.Movie;
import br.com.rafaelporreca.movieflix.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository repository;

    @Autowired
    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public Page<MovieDTO> findAllPaged(PageRequest pageRequest){
        Page<Movie> list = repository.findAll(pageRequest);
        Page<MovieDTO> listDto = list.map(obj -> new MovieDTO(obj));
        return listDto;
    }

    public MovieDTO findById(Long id) {
        Optional<Movie> obj = repository.findById(id);
        Movie entity = obj.orElseThrow();
        return new MovieDTO(entity);
    }
}
