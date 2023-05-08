package com.example.MyMusic.service.implementation;

import com.example.MyMusic.model.Album;
import com.example.MyMusic.repository.AlbumRepository;
import com.example.MyMusic.service.AlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AlbumServiceImplementation implements AlbumService {

    AlbumRepository albumRepository;

    @Autowired
    public AlbumServiceImplementation(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAllAlbums() {
        return (List<Album>) albumRepository.findAll();
    }

    @Override
    public Optional<Album> getAlbumById(int id) {
        return albumRepository.findById(id);
    }

    @Override
    public String addAlbum(Album album)
    {
        albumRepository.save(album);
        return "Album saved successfully.";
    }
    @Override
    public void deleteAlbumById(int id) {
        albumRepository.deleteById(id);
    }

    @Override
    public long getAlbumCount() {
        return albumRepository.count();
    }
}
