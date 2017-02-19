package com.jfsaaved.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsaaved.domain.Post;
import com.jfsaaved.repository.PostRepository;

@Service
public class PostService {
	
	private PostRepository postRepository;
	
	@Autowired
	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	public Post getLatestPost() {
		return postRepository.findFirstByOrderByPostedOnDesc();
	}

}
