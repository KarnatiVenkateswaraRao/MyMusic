package com.example.MyMusic.service;


import com.example.MyMusic.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {

    List<Genre> findAllGenres();
    Optional<Genre> getGenreById(int id);
    void deleteGenreById(int id);
    void addNewGenre(Genre genre);
    long getGenreCount();
}
