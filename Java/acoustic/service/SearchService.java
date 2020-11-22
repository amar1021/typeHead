package com.ecoustic.autocomplete.acoustic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoustic.autocomplete.acoustic.entity.Search;
import com.ecoustic.autocomplete.acoustic.repository.SearchRepository;

@Service
public class SearchService {

	@Autowired
	SearchRepository searchRepository;
	
	public List<Search> getAllSearch() {
		List<Search> search = new ArrayList<Search>();
		searchRepository.findAll().forEach(search::add);
		return search;
	}
}
