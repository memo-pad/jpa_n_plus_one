package com.example.jpa_n_plus_one.repository;

import com.example.jpa_n_plus_one.entity.NeoParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NeoParentRepository extends JpaRepository<NeoParent, Integer> {

    @Query("SELECT DISTINCT x FROM NeoParent x " +
            "LEFT JOIN FETCH x.neoChildOnes " +
            "LEFT JOIN FETCH x.neoChildTwos")
    List<NeoParent> findParentWithDoubleJoin();
}
