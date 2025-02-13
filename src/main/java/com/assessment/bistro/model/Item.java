package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ItemID;
    private int ItemCategoryID;
    private String ItemDescription;
    @Temporal(TemporalType.DATE)
    private LocalDate StartDate;
    private LocalDate EndDate;
    private double UnitPrice;

    public Item() {

    }

    public Item(int itemCategoryID, String itemDescription, LocalDate startDate, LocalDate endDate, double unitPrice) {
        ItemCategoryID = itemCategoryID;
        ItemDescription = itemDescription;
        StartDate = startDate;
        EndDate = endDate;
        UnitPrice = unitPrice;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public int getItemCategoryID() {
        return ItemCategoryID;
    }

    public void setItemCategoryID(int itemCategoryID) {
        ItemCategoryID = itemCategoryID;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemID=" + ItemID +
                ", ItemCategoryID=" + ItemCategoryID +
                ", ItemDescription='" + ItemDescription + '\'' +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", UnitPrice=" + UnitPrice +
                '}';
    }
}
