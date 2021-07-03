package br.com.rafaelporreca.movieflix.repositories;

import br.com.rafaelporreca.movieflix.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {
}
