package com.example.MyMusic.repository;

import com.example.MyMusic.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,Integer> {
}
