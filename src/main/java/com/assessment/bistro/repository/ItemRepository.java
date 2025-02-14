package com.assessment.bistro.repository;

import com.assessment.bistro.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    @NativeQuery("SELECT * FROM item WHERE Item_ID = ?1;")
    Optional<Item> getItemById (int itemID);

    @NativeQuery("SELECT * FROM item;")
    List<Item> getAllItems();



}
