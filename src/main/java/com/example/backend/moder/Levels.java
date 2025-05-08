package com.example.backend.moder;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "player_levels")
public class Levels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer level_id;
    private String level_name;
    private Integer required_matches;
    private Float  required_winrate;
    private Integer reward_stars;
    private Integer stars_bet;


}
