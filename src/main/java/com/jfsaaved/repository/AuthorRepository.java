package com.jfsaaved.repository;

import org.springframework.data.repository.CrudRepository;

import com.jfsaaved.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
