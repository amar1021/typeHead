package com.ecoustic.autocomplete.acoustic.REST;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoustic.autocomplete.acoustic.entity.Search;
import com.ecoustic.autocomplete.acoustic.repository.SearchRepository;
import com.ecoustic.autocomplete.acoustic.service.SearchService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RestControllerc {

	@Autowired
	private SearchRepository repository;
	
	@Autowired
	SearchService searchService;
	
	final Logger logger = LoggerFactory.getLogger(RestControllerc.class);

	
	@RequestMapping("/search")
	public List<Search> getAllSearch() {
		logger.debug("I am in getAllSearch");
		return searchService.getAllSearch();
	}
	
	@RequestMapping("/sample")
	public String Sample() {
//		SampleResponse response = new SampleResponse();
//		response.setId(1);
//		response.setMessage("Your name is "+name);
		return "Helllo";

	}
	
	@GetMapping(path = "/{name}")
    public Optional<Search> find(@PathVariable("name") String name) {
        return repository.findById(name);
    }
}