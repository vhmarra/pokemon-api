package br.com.pokemom.api.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Abilities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ability_name")
    private String name;

    @Column(name = "ability_url")
    private String url;

    @Column(name = "is_ability_hidden")
    private Boolean is_hidden;

    @Column(name = "ability_slot")
    private Long slot;

}
