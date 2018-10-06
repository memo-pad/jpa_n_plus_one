package com.example.jpa_n_plus_one.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "child_two")
@Entity
@Data
@ToString(exclude = "parent")
public class ChildTwo {

    @Id
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId", foreignKey = @ForeignKey(ConstraintMode.PROVIDER_DEFAULT))
    private Parent parent;
}
