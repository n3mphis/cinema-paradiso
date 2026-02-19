package com.cinema_paradiso.cinema.paradiso.repository;

import com.cinema_paradiso.cinema.paradiso.model.Genero;
import com.cinema_paradiso.cinema.paradiso.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    List<Pelicula> findByGenero(Genero genero);
    List<Pelicula> findByDirectorContainingIgnoreCase(String director);
}
