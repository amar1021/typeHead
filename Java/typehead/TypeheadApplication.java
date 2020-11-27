package com.ecoustic.autocomplete.acoustic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AcousticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcousticApplication.class, args);
	}

//	@Bean
//    protected CommandLineRunner init(final SearchRepository userRepository) {
//        return args -> {
//            Search user = new Search();
//            user.setName("Name");
//            user.setDesc("Desc");
//            user.setId(1);
//            userRepository.save(user);
//        };
//    }
}
