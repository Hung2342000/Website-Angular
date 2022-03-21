package com.example.backend.service;

import com.example.backend.dto.CategoryDto;
import com.example.backend.model.Category;
import com.example.backend.model.Freelancer;
import com.example.backend.repository.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FreelancerService {
    @Autowired
    FreelancerRepository freelancerRepository;
    public List<Freelancer> getList(){

        return freelancerRepository.findAll();
    }
}
