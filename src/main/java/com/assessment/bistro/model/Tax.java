package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Tax_ID")
    private int taxID;

    @Column(name = "Tax_Percentage")
    private BigDecimal taxPercentage;

    @Temporal(TemporalType.DATE)
    @Column(name = "Start_Date")
    private LocalDate startDate;

    @Column(name = "End_Date")
    private LocalDate endDate;

    public Tax() {

    }

    public Tax(int taxID, BigDecimal taxPercentage, LocalDate startDate, LocalDate endDate) {
        this.taxID = taxID;
        this.taxPercentage = taxPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getTaxID() {
        return taxID;
    }

    public void setTaxID(int taxID) {
        this.taxID = taxID;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
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

    @Override
    public String toString() {
        return "Tax{" +
                "TaxID=" + taxID +
                ", TaxPercentage=" + taxPercentage +
                ", StartDate=" + startDate +
                ", EndDate=" + endDate +
                '}';
    }
}
