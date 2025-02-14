package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="`order`")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_ID")
    private int orderID;

    @Column(name = "Server_ID")
    private int serverID;

    @Temporal(TemporalType.DATE)
    @Column(name = "Order_Date")
    private LocalDate orderDate;

    @Column(name = "Sub_Total")
    private double subTotal;

    @Column(name = "Tax")
    private double tax;

    @Column(name = "Tip")
    private double tip;

    @Column(name = "Total")
    private double total;

    public Order() {

    }

    public Order(int serverID, int orderID, LocalDate orderDate, double subTotal, double tax, double tip, double total) {
        this.serverID = serverID;
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.subTotal = subTotal;
        this.tax = tax;
        this.tip = tip;
        this.total = total;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getServerID() {
        return serverID;
    }

    public void setServerID(int serverID) {
        this.serverID = serverID;
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
                "orderID=" + orderID +
                ", serverID=" + serverID +
                ", orderDate=" + orderDate +
                ", subTotal=" + subTotal +
                ", tax=" + tax +
                ", tip=" + tip +
                ", total=" + total +
                '}';
    }
}
