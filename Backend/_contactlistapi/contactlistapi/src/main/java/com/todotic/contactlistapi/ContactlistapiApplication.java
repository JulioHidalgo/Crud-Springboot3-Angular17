package com.todotic.contactlistapi;

import com.todotic.contactlistapi.entity.Contact;
import com.todotic.contactlistapi.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ContactlistapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactlistapiApplication.class, args);
	}

    @Bean
	CommandLineRunner runner(ContactRepository contactRepository){
         return new CommandLineRunner() {
			 @Override
			 public void run(String... args) throws Exception {
				 List<Contact> contacts = Arrays.asList(
						 new Contact("Carlos","carlos@gmail.com", LocalDateTime.now()),
						 new Contact("Juan","juan@gmail.com", LocalDateTime.now() ),
						 new Contact("Marcelo","marcelo@gmail.com", LocalDateTime.now()),
						 new Contact("Luis", "Luis@gmail.com", LocalDateTime.now()),
						 new Contact("Alejandra", "ale@gmail.com", LocalDateTime.now())
				 );
				 contactRepository.saveAll(contacts);
			 }
		 };
	};
}
