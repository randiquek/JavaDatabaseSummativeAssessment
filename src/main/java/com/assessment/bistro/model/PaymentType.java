package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class PaymentType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Payment_Type_ID")
    private int paymentTypeID;

    @Column(name = "Payment_Type_Name")
    private String paymentTypeName;

    public PaymentType() {

    }

    public PaymentType(int paymentTypeID, String paymentTypeName) {
        this.paymentTypeID = paymentTypeID;
        this.paymentTypeName = paymentTypeName;
    }

    public int getPaymentTypeID() {
        return paymentTypeID;
    }

    public void setPaymentTypeID(int paymentTypeID) {
        this.paymentTypeID = paymentTypeID;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "PaymentTypeID=" + paymentTypeID +
                ", PaymentTypeName='" + paymentTypeName + '\'' +
                '}';
    }
}
