package com.demo.springdemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    private final ArtistDao artistDao;

    public ArtistService(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    // ------------------------------
    // DATABASE-POWERED OPERATIONS 🎵
    // ------------------------------

    // GET all artists
    public List<Artist> getAllArtists() {
        return artistDao.getAll();
    }

    // GET one artist by ID
    public Artist getArtistById(int id) {
        return artistDao.getById(id);
    }

    // POST — add a new artist
    public int addArtist(Artist artist) {
        return artistDao.insert(artist);
    }

    // PUT — update existing artist
    public int updateArtist(int id, Artist artist) {
        return artistDao.update(id, artist);
    }

    // DELETE — delete an artist
    public int deleteArtist(int id) {
        return artistDao.delete(id);
    }
}


