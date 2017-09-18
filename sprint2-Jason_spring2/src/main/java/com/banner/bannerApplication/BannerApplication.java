package com.banner.bannerApplication;

import com.banner.bannerApplication.entities.User;
import com.banner.bannerApplication.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
public class BannerApplication {
	private static final Logger log = LoggerFactory.getLogger(BannerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BannerApplication.class, args);

	}
	@Bean
	public CommandLineRunner show(UserRepository repository){
		return (args) -> {
			log.info("The List of People found with findAll():");
			log.info("                                        ");
			for(User user: repository.findAll()){
				log.info(user.toString());
			}
			log.info("");
			//this is where you get people by id
			//User user=repository.findOne();
			//log.info(user.toString());

			//fetch People by Last Name
			for(User variable: repository.findByLastName("Variable")){
				log.info(variable.toString());
			}
		};

	}
}
