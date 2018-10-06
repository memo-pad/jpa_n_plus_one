package com.example.jpa_n_plus_one.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Table(name = "neo_parent")
@Entity
@Data
@EqualsAndHashCode(exclude = {"neoChildOnes", "neoChildTwos"})
public class NeoParent {
    @Id
    private Integer id;

    @OneToMany(mappedBy = "neoParent")
    private Set<NeoChildOne> neoChildOnes;

    @OneToMany(mappedBy = "neoParent")
    private Set<NeoChildTwo> neoChildTwos;
}
