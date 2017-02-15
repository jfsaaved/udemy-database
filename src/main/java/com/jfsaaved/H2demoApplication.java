package com.jfsaaved;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jfsaaved.domain.Post;
import com.jfsaaved.repository.PostRepository;

@SpringBootApplication
public class H2demoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(H2demoApplication.class);

	// PostRepository
	@Autowired
	private PostRepository postRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}
	
	// PostConstruct
	@PostConstruct
	private void seePosts() {
		logger.info("seePosts method called. . .");
		for(Post post : postRepository.findAll()) {
			logger.info(post.toString());
		}
	}
	
}
