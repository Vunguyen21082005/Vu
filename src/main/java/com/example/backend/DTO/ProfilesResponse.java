package com.example.backend.DTO;

import com.example.backend.moder.Levels;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfilesResponse {
    private Integer user_id;
    private Integer total_matches;
    private Integer wins;
    private Float  winrate;
    private Integer current_stars;
    private Integer  elo_points;
    private String image_user;
    private Integer level_id ;
    private String level_name;
    private Integer required_matches;
    private Float  required_winrate;
    private Integer reward_stars;
    private Integer stars_bet;

}
