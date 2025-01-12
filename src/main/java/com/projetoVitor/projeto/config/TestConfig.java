package com.projetoVitor.projeto.config;

import com.projetoVitor.projeto.entities.User;
import com.projetoVitor.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("maria", "maria123@gmail.com", "87643833", "12345");
        User u2 = new User("zezin", "zezin123@gmail.com", "99643833", "12785");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
