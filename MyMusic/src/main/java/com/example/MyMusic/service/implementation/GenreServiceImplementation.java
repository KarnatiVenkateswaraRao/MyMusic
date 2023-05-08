package com.example.MyMusic.service.implementation;

import com.example.MyMusic.model.Genre;
import com.example.MyMusic.repository.GenreRepository;
import com.example.MyMusic.service.GenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class GenreServiceImplementation implements GenreService {

    GenreRepository genreRepository;

    @Autowired
    public GenreServiceImplementation(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> findAllGenres() {
        return (List<Genre>) genreRepository.findAll();
    }

    @Override
    public Optional<Genre> getGenreById(int id) {
        return genreRepository.findById(id);
    }

    @Override
    public void deleteGenreById(int id) {
        genreRepository.deleteById(id);
    }

    @Override
    public void addNewGenre(Genre genre) {
        genreRepository.save(genre);
    }

    @Override
    public long getGenreCount() {
        return genreRepository.count();
    }
}
