package com.example.backend.controller;

import com.example.backend.dto.CategoryDto;
import com.example.backend.model.Freelancer;
import com.example.backend.service.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/freelancer")
public class FreelancerControlller {
    @Autowired
    FreelancerService freelancerService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Freelancer> getList(){

        return freelancerService.getList();
    }

}

