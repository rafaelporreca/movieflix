package br.com.rafaelporreca.movieflix.repositories;

import br.com.rafaelporreca.movieflix.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
