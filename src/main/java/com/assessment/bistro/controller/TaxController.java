package com.assessment.bistro.controller;

import com.assessment.bistro.model.Tax;
import com.assessment.bistro.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tax")
public class TaxController {

    @Autowired
    private TaxRepository taxRepository;

    @GetMapping
    public List<Tax> getAllTaxes() {
        return taxRepository.findAll();
    }
}
