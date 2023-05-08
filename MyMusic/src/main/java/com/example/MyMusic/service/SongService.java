package com.example.MyMusic.service;


import com.example.MyMusic.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {

    List<Song> findAllSongs();
    Optional<Song> getSongById(int id);
    String addSong(Song song);
    void deleteSongById(int id);
    void addNewSong(Song song);
    long getSongCount();
}
