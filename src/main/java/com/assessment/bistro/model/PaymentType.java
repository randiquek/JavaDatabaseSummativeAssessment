package com.assessment.bistro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class PaymentType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PaymentTypeID;
    private String PaymentTypeName;

    public PaymentType(int paymentTypeID, String paymentTypeName) {
        PaymentTypeID = paymentTypeID;
        PaymentTypeName = paymentTypeName;
    }

    public int getPaymentTypeID() {
        return PaymentTypeID;
    }

    public void setPaymentTypeID(int paymentTypeID) {
        PaymentTypeID = paymentTypeID;
    }

    public String getPaymentTypeName() {
        return PaymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        PaymentTypeName = paymentTypeName;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "PaymentTypeID=" + PaymentTypeID +
                ", PaymentTypeName='" + PaymentTypeName + '\'' +
                '}';
    }
}
