package com.assessment.bistro;

import com.assessment.bistro.model.Item;
import com.assessment.bistro.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BistroApplication implements CommandLineRunner {

	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(BistroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(Item i : itemRepository.findAll()) {
			System.out.println(i);
		}
	}
}
