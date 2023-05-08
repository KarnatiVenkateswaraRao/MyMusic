package com.example.MyMusic.service.implementation;

import com.example.MyMusic.model.Artist;
import com.example.MyMusic.repository.ArtistRepository;
import com.example.MyMusic.service.ArtistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ArtistServiceImplementation implements ArtistService {

    ArtistRepository artistRepository;

    @Autowired
    public ArtistServiceImplementation(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> findAllArtists() {
        return (List<Artist>) artistRepository.findAll();
    }

    @Override
    public Optional<Artist> getArtistById(int id) {
        return artistRepository.findById(id);
    }

    @Override
    public void deleteArtistById(int id) {
        artistRepository.deleteById(id);
    }

    @Override
    public long getArtistCount() {
        return artistRepository.count();
    }
}
