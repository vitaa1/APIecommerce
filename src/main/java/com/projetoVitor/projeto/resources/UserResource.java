package com.projetoVitor.projeto.resources;

import com.projetoVitor.projeto.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "vitor", "vitor@gmail.com", "86981342813", "12345");
        return ResponseEntity.ok().body(u);
    }

}
