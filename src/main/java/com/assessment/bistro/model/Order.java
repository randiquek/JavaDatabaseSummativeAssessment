package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="`order`")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;
    private int ServerID;
    @Temporal(TemporalType.DATE)
    private LocalDate OrderDate;
    private double SubTotal;
    private double Tax;
    private double Tip;
    private double Total;

    public Order(int orderID, int serverID, LocalDate orderDate, double subTotal, double tax, double tip, double total) {
        OrderID = orderID;
        ServerID = serverID;
        OrderDate = orderDate;
        SubTotal = subTotal;
        Tax = tax;
        Tip = tip;
        Total = total;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getServerID() {
        return ServerID;
    }

    public void setServerID(int serverID) {
        ServerID = serverID;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double subTotal) {
        SubTotal = subTotal;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }

    public double getTip() {
        return Tip;
    }

    public void setTip(double tip) {
        Tip = tip;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderID=" + OrderID +
                ", ServerID=" + ServerID +
                ", OrderDate=" + OrderDate +
                ", SubTotal=" + SubTotal +
                ", Tax=" + Tax +
                ", Tip=" + Tip +
                ", Total=" + Total +
                '}';
    }
}
