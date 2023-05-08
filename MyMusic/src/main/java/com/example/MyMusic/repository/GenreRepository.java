package com.example.MyMusic.repository;

import org.springframework.data.repository.CrudRepository;

public interface GenreRepository<Genre> extends CrudRepository<Genre,Integer> {
}
