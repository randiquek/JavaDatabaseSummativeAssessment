package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="`order`")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private int serverId;
    @Temporal(TemporalType.DATE)
    private LocalDate orderDate;
    private double subTotal;
    private double tax;
    private double tip;
    private double total;

    public Order() {

    }

    public Order(int orderId, int serverId, LocalDate orderDate, double subTotal, double tax, double tip, double total) {
        this.orderId = orderId;
        this.serverId = serverId;
        this.orderDate = orderDate;
        this.subTotal = subTotal;
        this.tax = tax;
        this.tip = tip;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", serverId=" + serverId +
                ", orderDate=" + orderDate +
                ", subTotal=" + subTotal +
                ", tax=" + tax +
                ", tip=" + tip +
                ", total=" + total +
                '}';
    }
}
