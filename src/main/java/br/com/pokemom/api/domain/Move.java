package br.com.pokemom.api.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "move_name")
    private String name;

    @Column(name = "move_url")
    private String url;
}
