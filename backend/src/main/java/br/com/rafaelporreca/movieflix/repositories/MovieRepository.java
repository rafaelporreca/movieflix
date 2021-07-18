package br.com.rafaelporreca.movieflix.repositories;

import br.com.rafaelporreca.movieflix.entities.Genre;
import br.com.rafaelporreca.movieflix.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {


//    @Query("SELECT obj FROM Movie obj WHERE :genre IS NULL OR obj.genre.id = :genreId")
    @Query("SELECT DISTINCT obj FROM Movie obj WHERE (COALESCE(:genre) IS NULL OR obj.genre = :genre)")
    Page<Movie> find(Genre genre, Pageable pageable);
}
