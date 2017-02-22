package com.jfsaaved.repository;

import com.jfsaaved.domain.Post;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{

	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();
	
	Post findBySlug(String slug);

	
}
