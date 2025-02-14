package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Item_ID")
    private int itemID;

    @Column(name = "Item_Category_ID")
    private int itemCategoryID;

    @Column(name = "Item_Description")
    private String itemDescription;

    @Temporal(TemporalType.DATE)
    @Column(name = "Start_Date")
    private LocalDate startDate;

    @Column(name = "End_Date")
    private LocalDate endDate;

    @Column(name = "Unit_Price")
    private double unitPrice;

    public Item() {

    }

    public Item(int itemID, int itemCategoryID, String itemDescription, LocalDate startDate, LocalDate endDate, double unitPrice) {
        this.itemID = itemID;
        this.itemCategoryID = itemCategoryID;
        this.itemDescription = itemDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.unitPrice = unitPrice;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getItemCategoryID() {
        return itemCategoryID;
    }

    public void setItemCategoryID(int itemCategoryID) {
        this.itemCategoryID = itemCategoryID;
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
                "itemID=" + itemID +
                ", itemCategoryID=" + itemCategoryID +
                ", itemDescription='" + itemDescription + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
