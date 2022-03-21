package com.example.backend.repository;

import com.example.backend.model.Category;
import com.example.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select c from User c where c.email = ?1")
    User findByName(String name);
}
