package com.example.MyMusic.service;


import com.example.MyMusic.model.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {

    List<Album> findAllAlbums();
    Optional<Album> getAlbumById(int id);
    String addAlbum(Album album);
    void deleteAlbumById(int id);
    long getAlbumCount();
}
