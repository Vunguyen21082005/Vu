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
@Table(name = "player_profiles")
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private Integer total_matches;
    private Integer wins;
    private Float  winrate;
    private Integer current_stars;
    private Integer  elo_points;
    private String image_user;
    @ManyToOne
    @JoinColumn(name = "level_id",referencedColumnName = "level_id")
    private Levels level_id ;
}
