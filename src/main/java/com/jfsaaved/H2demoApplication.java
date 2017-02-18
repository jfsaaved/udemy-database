package com.jfsaaved;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jfsaaved.domain.Post;
import com.jfsaaved.repository.PostRepository;
import com.jfsaaved.service.DataLoader;

@SpringBootApplication
public class H2demoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}
	
}
