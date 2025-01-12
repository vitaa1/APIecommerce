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
        User u = new User(1L, "jose", "josevitor@gmail.com", "86981342815", "123456");
        return ResponseEntity.ok().body(u);
    }
}
