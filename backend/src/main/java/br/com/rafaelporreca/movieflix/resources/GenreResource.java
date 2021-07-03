package br.com.rafaelporreca.movieflix.resources;

import br.com.rafaelporreca.movieflix.dto.GenreDTO;
import br.com.rafaelporreca.movieflix.servicies.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreResource {

    private GenreService service;

    @Autowired
    public GenreResource(GenreService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GenreDTO>> listAllGenres(){
        List<GenreDTO> listDto = service.listAllGenre();
        return ResponseEntity.ok().body(listDto);
    }
}
