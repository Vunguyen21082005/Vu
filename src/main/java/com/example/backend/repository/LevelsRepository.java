package com.example.backend.repository;

import com.example.backend.moder.Levels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelsRepository extends JpaRepository<Levels,Integer> {
}
