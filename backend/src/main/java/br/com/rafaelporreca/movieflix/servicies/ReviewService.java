package br.com.rafaelporreca.movieflix.servicies;

import br.com.rafaelporreca.movieflix.dto.ReviewDTO;
import br.com.rafaelporreca.movieflix.entities.Movie;
import br.com.rafaelporreca.movieflix.entities.Review;
import br.com.rafaelporreca.movieflix.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReviewService {

    private ReviewRepository repository;
    private AuthService authService;

    @Autowired
    public ReviewService(ReviewRepository repository, AuthService authService) {
        this.repository = repository;
        this.authService = authService;
    }

    @Transactional
    public ReviewDTO insert(ReviewDTO dto) {
        Review obj = new Review();
        copyDtoToObj(dto,obj);
        obj = repository.save(obj);
        return new ReviewDTO(obj, obj.getUser());
    }

    private void copyDtoToObj(ReviewDTO dto, Review obj) {
        obj.setText(dto.getText());
        obj.setMovie(new Movie(dto.getMovieId()));
        obj.setUser(authService.authenticated());
    }
}
