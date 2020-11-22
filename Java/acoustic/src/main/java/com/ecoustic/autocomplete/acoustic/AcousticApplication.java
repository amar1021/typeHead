package com.ecoustic.autocomplete.acoustic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ecoustic.autocomplete.acoustic.search.Topic;
import com.ecoustic.autocomplete.acoustic.search.TopicRepository;


@SpringBootApplication
public class AcousticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcousticApplication.class, args);
	}

//	@Bean
//    protected CommandLineRunner init(final TopicRepository userRepository) {
//        return args -> {
//            Topic user = new Topic();
//            user.setName("Name");
//            user.setDescription("Desc");
//            user.setId("10");
//            userRepository.save(user);
//        };
//    }
}
