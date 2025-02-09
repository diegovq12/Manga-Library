package com.diegoddev.mangashop.gestion_mangas.repository;

import com.diegoddev.mangashop.gestion_mangas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findByUsernameIgnoreCase(String username);
}
