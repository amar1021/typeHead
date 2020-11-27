package com.ecoustic.autocomplete.acoustic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoustic.autocomplete.acoustic.entity.Search;

@Repository
public interface SearchRepository extends CrudRepository<Search, String>{}
