package com.marjane.marjanepromotionrestapi.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Market")
@Table(name = "marjane_market")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "region_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "marjane_market___fk "))
    private Regions region;

    @Basic
    @Column(name = "name")
    private String name;
}
