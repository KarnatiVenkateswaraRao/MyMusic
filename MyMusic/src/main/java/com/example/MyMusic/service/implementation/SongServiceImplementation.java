package com.example.MyMusic.service.implementation;

import com.example.MyMusic.model.Song;
import com.example.MyMusic.repository.SongRepository;
import com.example.MyMusic.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class SongServiceImplementation implements SongService {

    SongRepository songRepository;

    @Autowired
    public SongServiceImplementation(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> findAllSongs() {
        return (List<Song>) songRepository.findAll();
    }

    @Override
    public Optional<Song> getSongById(int id) {
        return songRepository.findById(id);
    }

    @Override
    public String addSong(Song song)
    {
        songRepository.save(song);
        return "Song Saved";
    }
    @Override
    public void deleteSongById(int id) {
        songRepository.deleteById(id);
    }

    @Override
    public void addNewSong(Song song) {
        log.info("addNewSong called");
        songRepository.save(song);
    }

    @Override
    public long getSongCount() {
        return songRepository.count();
    }
}
