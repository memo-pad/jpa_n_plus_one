package com.example.jpa_n_plus_one.repository;

import com.example.jpa_n_plus_one.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParentRepository extends JpaRepository<Parent, Integer> {

    @Query("SELECT DISTINCT x FROM Parent x " +
            "LEFT JOIN FETCH x.childOnes")
    List<Parent> findParentWithSingleJoin();

    // org.hibernate.loader.MultipleBagFetchExceptionが発生してしまう
    /*
    @Query("SELECT DISTINCT x FROM Parent x " +
            "LEFT JOIN FETCH x.childOnes " +
            "LEFT JOIN FETCH x.childTwos")
    List<Parent> findParentWithDoubleJoin();
    */
}
