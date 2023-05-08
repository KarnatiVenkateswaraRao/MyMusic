package com.example.MyMusic.repository;

import com.example.MyMusic.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist,Integer> {
}
