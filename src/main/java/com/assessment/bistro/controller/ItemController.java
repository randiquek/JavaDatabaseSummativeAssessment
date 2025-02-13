package com.assessment.bistro.controller;

import com.assessment.bistro.model.Item;
import com.assessment.bistro.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping()
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
