package com.example.MyMusic.repository;

import com.example.MyMusic.model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Integer> {
}
