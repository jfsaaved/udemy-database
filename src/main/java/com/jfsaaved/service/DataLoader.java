package com.jfsaaved.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsaaved.domain.Author;
import com.jfsaaved.domain.Post;
import com.jfsaaved.repository.AuthorRepository;
import com.jfsaaved.repository.PostRepository;

@Service
public class DataLoader {
	
	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	@Autowired
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@PostConstruct
	private void loadData() {
		Author dv = new Author("Dan", "Vega");
		authorRepository.save(dv);
		
		Post post = new Post("Spring Data Rocks");
		post.setBody("Post body here...");
		post.setPostedOn(new Date());
		post.setAuthor(dv);
		postRepository.save(post);
		
	}
	
}
