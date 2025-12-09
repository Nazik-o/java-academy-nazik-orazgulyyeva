package com.demo.springdemo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService service;

    public ArtistController(ArtistService service) {
        this.service = service;
    }

    // ---------------------------
    // GET /artists (all artists)
    // ---------------------------
    @GetMapping
    public List<Artist> getAllArtists() {
        return service.getAllArtists();
    }

    // ---------------------------------
    // GET /artists/{id} (one artist)
    // ---------------------------------
    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable int id) {
        return service.getArtistById(id);
    }

    // -------------------------------
    // POST /artists (add new artist)
    // -------------------------------
    @PostMapping
    public String addArtist(@RequestBody Artist artist) {
        int rows = service.addArtist(artist);
        return rows + " artist(s) inserted";
    }

    // -------------------------------
    // PUT /artists/{id} (update)
    // -------------------------------
    @PutMapping("/{id}")
    public String updateArtist(@PathVariable int id, @RequestBody Artist artist) {
        int rows = service.updateArtist(id, artist);
        return rows + " artist(s) updated";
    }

    // -----------------------------------
    // DELETE /artists/{id} (delete)
    // -----------------------------------
    @DeleteMapping("/{id}")
    public String deleteArtist(@PathVariable int id) {
        int rows = service.deleteArtist(id);
        return rows + " artist(s) deleted";
    }
}


//package com.example.SpringBootDemo;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class ArtistController {
//
//    private final ArtistService service;
//
//    public ArtistController(ArtistService service) {
//        this.service = service;
//    }
//
////    @GetMapping("/artist")
////    public Artist getFavoriteArtist() {
////        return service.getFavoriteArtist();
////    }
//
//    @GetMapping("/artist/name")
//    public String getFavoriteArtistName() {
//        return service.getFavoriteArtist().name;
//    }
//
//
//    @GetMapping("/artists")
//    public List<Artist> getAllArtists() {
//        return service.getAllArtists();
//    }
//
//    @GetMapping("/artist/{name}")
//    public Artist getArtistByName(@PathVariable String name) {
//        return service.getArtistByName(name);
//    }
//
//
//
//}
//
