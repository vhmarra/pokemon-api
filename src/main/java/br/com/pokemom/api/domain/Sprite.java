package br.com.pokemom.api.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Sprite {

    @Id
    private Long id;

    @Column(name = "url_default")
    private String urlDefault;

    @Column(name = "url_shiny")
    private String urlShiny;
}
