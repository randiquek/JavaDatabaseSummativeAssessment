package com.assessment.bistro;

import com.assessment.bistro.model.*;
import com.assessment.bistro.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BistroApplication implements CommandLineRunner {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private PaymentTypeRepository paymentTypeRepository;

	@Autowired
	private ServerRepository serverRepository;

	@Autowired
	private TaxRepository taxRepository;

	public static void main(String[] args) {
		SpringApplication.run(BistroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(Tax tax : taxRepository.findAll()) {
			System.out.println(tax);
		}
	}
}
