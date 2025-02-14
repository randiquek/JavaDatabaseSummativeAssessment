package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taxId;
    private BigDecimal taxPercentage;
    @Temporal(TemporalType.DATE)
    private LocalDate startDate;
    private LocalDate endDate;

    public Tax() {

    }

    public Tax(int taxId, BigDecimal taxPercentage, LocalDate startDate, LocalDate endDate) {
        this.taxId = taxId;
        this.taxPercentage = taxPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
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
                "taxId=" + taxId +
                ", taxPercentage=" + taxPercentage +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
