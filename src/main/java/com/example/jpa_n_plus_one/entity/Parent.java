package com.example.jpa_n_plus_one.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "parent")
@Entity
@Data
public class Parent {
    @Id
    private Integer id;

    @OneToMany(mappedBy = "parent")
    private List<ChildOne> childOnes;

    @OneToMany(mappedBy = "parent")
    private List<ChildTwo> childTwos;
}
