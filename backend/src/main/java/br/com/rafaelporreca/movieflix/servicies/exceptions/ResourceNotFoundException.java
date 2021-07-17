package br.com.rafaelporreca.movieflix.servicies.exceptions;


public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
