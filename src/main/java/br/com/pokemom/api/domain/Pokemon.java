package br.com.pokemom.api.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Pokemon {

    @Id
    @Column(name = "table_pokemon_id")
    //TODO gerar um UUID toda vez que for salvar um pokemom
    private UUID id;

    @Column(name = "pokemon_id")
    private Long pokemonId;

    @Column(name = "pokemon_height")
    private Long height;

    @Column(name = "pokemon_weight")
    private Long weight;

    @Column(name = "is_starter")
    private Boolean isStarter;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Move> moves;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Abilities> abilities;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Sprite> sprites;

}
