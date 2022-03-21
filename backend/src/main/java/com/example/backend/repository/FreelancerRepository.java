package com.example.backend.repository;

import com.example.backend.model.Category;
import com.example.backend.model.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer,Long> {
}
