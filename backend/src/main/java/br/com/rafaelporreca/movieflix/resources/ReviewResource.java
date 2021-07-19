package br.com.rafaelporreca.movieflix.resources;

import br.com.rafaelporreca.movieflix.dto.ReviewDTO;
import br.com.rafaelporreca.movieflix.servicies.ReviewService;
import br.com.rafaelporreca.movieflix.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/reviews")
public class ReviewResource {

    private ReviewService service;

    @Autowired
    public ReviewResource(ReviewService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ReviewDTO> insert(@RequestBody @Valid ReviewDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
