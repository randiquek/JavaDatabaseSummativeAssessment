package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TaxID;
    private BigDecimal TaxPercentage;
    @Temporal(TemporalType.DATE)
    private LocalDate StartDate;
    private LocalDate EndDate;

    public Tax(int taxID, BigDecimal taxPercentage, LocalDate startDate, LocalDate endDate) {
        TaxID = taxID;
        TaxPercentage = taxPercentage;
        StartDate = startDate;
        EndDate = endDate;
    }

    public int getTaxID() {
        return TaxID;
    }

    public void setTaxID(int taxID) {
        TaxID = taxID;
    }

    public BigDecimal getTaxPercentage() {
        return TaxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        TaxPercentage = taxPercentage;
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

    @Override
    public String toString() {
        return "Tax{" +
                "TaxID=" + TaxID +
                ", TaxPercentage=" + TaxPercentage +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                '}';
    }
}
