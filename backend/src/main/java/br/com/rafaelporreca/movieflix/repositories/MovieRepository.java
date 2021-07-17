package br.com.rafaelporreca.movieflix.repositories;

import br.com.rafaelporreca.movieflix.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {


//    Page<Movie> find
}
