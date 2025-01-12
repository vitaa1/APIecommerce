package com.projetoVitor.projeto.repositories;

import com.projetoVitor.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
