package com.typehead.autocomplete.typehead;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.typehead.autocomplete.typehead.search.Topic;
import com.typehead.autocomplete.typehead.search.TopicRepository;


@SpringBootApplication
public class TypeHeadApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeHeadApplication.class, args);
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
