package com.assessment.bistro.repository;


import com.assessment.bistro.model.Item;
//import com.assessment.bistro.model.ItemCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemRepositoryTest {

    Item expectedItem;

    @Autowired
    private ItemRepository itemRepository;

    @BeforeEach
    public void setup() {

        expectedItem = new Item(33, "Cake", 1, "A slice of cake to fill your heart", LocalDate.of(2020, 1, 1), null, 3.0);
    }

    @Test
    void testGetItemById() {
        Optional<Item> item = itemRepository.getItemById(1);
        assertTrue(item.isPresent());
    }
    @Test
    void testGetAllItems() {
        List<Item> allItems = itemRepository.getAllItems();
        assertFalse(allItems.isEmpty());
        assertTrue(allItems.size() >= 1);
    }

    @Test
    void testGetItemsByCategory() {
        List<Item> itemsByCategory = itemRepository.getItemsByCategory(3);
        assertFalse(itemsByCategory.isEmpty());

        for (Item item : itemsByCategory) {
            assertEquals(3, item.getItemCategoryId());
        }
    }

    @Test
    void testUpdateItem() {
    
    }

    @Test
    void testAddItem() {

    }
}