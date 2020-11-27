package com.typehead.autocomplete.typehead.search;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicRepository extends JpaRepository<Topic, String>{
	
	@Query(value = "SELECT * FROM Topic WHERE Topic.name LIKE %?1%", nativeQuery = true)
	List<Topic> searchByName(String name);
	
	@Query(value = "SELECT * FROM Topic WHERE Topic.description LIKE %?1%", nativeQuery = true)
	List<Topic> searchByDesc(String name);
}

