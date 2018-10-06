package com.example.jpa_n_plus_one.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "neo_child_one")
@Entity
@Data
@ToString(exclude = "neoParent")
public class NeoChildOne {
    @Id
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "neoParentId", foreignKey = @ForeignKey(ConstraintMode.PROVIDER_DEFAULT))
    private NeoParent neoParent;
}
