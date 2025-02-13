package com.assessment.bistro.controller;

import com.assessment.bistro.model.Server;
import com.assessment.bistro.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servers")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping
    public List<Server> getAllServers() {
        return serverRepository.findAll();
    }
}
