package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
    private String itemName;
    private int itemCategoryId;
    private String itemDescription;
    @Temporal(TemporalType.DATE)
    private LocalDate startDate;
    private LocalDate endDate;
    private double unitPrice;

    public Item() {

    }

    public Item(int itemId, String itemName, int itemCategoryId, String itemDescription, LocalDate startDate, LocalDate endDate, double unitPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCategoryId = itemCategoryId;
        this.itemDescription = itemDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.unitPrice = unitPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(int itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemCategoryId=" + itemCategoryId +
                ", itemDescription='" + itemDescription + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
