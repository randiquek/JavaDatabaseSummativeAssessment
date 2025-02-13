package com.assessment.bistro.controller;

import com.assessment.bistro.model.PaymentType;
import com.assessment.bistro.repository.PaymentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment-types")
public class PaymentTypeController {

    @Autowired
    private PaymentTypeRepository paymentTypeRepository;

    @GetMapping()
    public List<PaymentType> getAllPaymentTypes() {
        return paymentTypeRepository.findAll();
    }
}
