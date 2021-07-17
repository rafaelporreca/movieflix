package br.com.rafaelporreca.movieflix.servicies.exceptions;

public class UnauthorizedException extends RuntimeException{

    public UnauthorizedException(String msg) {
        super(msg);
    }
}