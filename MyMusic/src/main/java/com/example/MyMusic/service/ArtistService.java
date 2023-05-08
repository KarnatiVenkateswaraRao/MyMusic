package com.example.MyMusic.service;


import com.example.MyMusic.model.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistService {

    List<Artist> findAllArtists();
    Optional<Artist> getArtistById(int id);
    void deleteArtistById(int id);
    long getArtistCount();
}
