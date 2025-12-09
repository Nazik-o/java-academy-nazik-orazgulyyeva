package com.demo.springdemo;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcArtistDao implements ArtistDao {

    private final DataSource dataSource;

    public JdbcArtistDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Artist> getAll() {
        List<Artist> artists = new ArrayList<>();
        String sql = "SELECT id, name, album_title, song_title FROM springBoot.artists";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Artist artist = new Artist(
                        rs.getString("name"),
                        rs.getString("album_title"),
                        rs.getString("song_title")
                );
                artists.add(artist);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return artists;
    }

    @Override
    public Artist getById(int id) {
        String sql = "SELECT name, album_title, song_title FROM artists WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Artist(
                            rs.getString("name"),
                            rs.getString("album_title"),
                            rs.getString("song_title")
                    );
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null; // not found
    }

    @Override
    public int insert(Artist artist) {
        String sql = "INSERT INTO artists (name, album_title, song_title) VALUES (?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, artist.name);
            ps.setString(2, artist.albumTitle);
            ps.setString(3, artist.songTitle);

            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(int id, Artist artist) {
        String sql = "UPDATE artists SET name = ?, album_title = ?, song_title = ? WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, artist.name);
            ps.setString(2, artist.albumTitle);
            ps.setString(3, artist.songTitle);
            ps.setInt(4, id);

            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM artists WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

