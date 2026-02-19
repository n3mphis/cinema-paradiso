package com.cinema_paradiso.cinema.paradiso.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movies")
@Setter @Getter
@NoArgsConstructor
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String director;

    @Min(1888)
    private int anio;

    @Column(columnDefinition = "TEXT")
    private String sinopsis;

    @Positive
    private int duracion;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    public Pelicula(String titulo, String director, int anio, String sinopsis, int duracion, Genero genero) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.duracion = duracion;
        this.genero = genero;
    }
}
