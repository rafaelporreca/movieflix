package br.com.rafaelporreca.movieflix.servicies;

import br.com.rafaelporreca.movieflix.entities.User;
import br.com.rafaelporreca.movieflix.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);


    private UserRepository userRepository;
    private AuthService authService;

    @Autowired
    public UserService(UserRepository UserRepository, AuthService authService) {
        this.userRepository = UserRepository;
        this.authService = authService;
    }


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(userName);
        if(user == null){
            logger.error("User not found: " + userName);
            throw new UsernameNotFoundException("Email not found");
        }
        logger.info("User found: " + userName);
        return user;
    }
}
