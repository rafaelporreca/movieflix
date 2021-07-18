package br.com.rafaelporreca.movieflix.servicies;

import br.com.rafaelporreca.movieflix.dto.MovieDTO;
import br.com.rafaelporreca.movieflix.entities.Genre;
import br.com.rafaelporreca.movieflix.entities.Movie;
import br.com.rafaelporreca.movieflix.repositories.GenreRepository;
import br.com.rafaelporreca.movieflix.repositories.MovieRepository;
import br.com.rafaelporreca.movieflix.servicies.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository repository;
    private GenreRepository genreRepository;

    @Autowired
    public MovieService(MovieRepository repository, GenreRepository genreRepository) {
        this.repository = repository;
        this.genreRepository = genreRepository;
    }

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAllPaged(Long genreId, PageRequest pageRequest){
        Genre genre = (genreId == 0) ? null : genreRepository.getOne(genreId);
        Page<Movie> list = repository.find(genre, pageRequest);
        Page<MovieDTO> listDto = list.map(obj -> new MovieDTO(obj));
        return listDto;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Optional<Movie> obj = repository.findById(id);
        Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new MovieDTO(entity,entity.getReviews());
    }
}
