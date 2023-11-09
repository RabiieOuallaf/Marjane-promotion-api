package com.marjane.marjanepromotionrestapi.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Regions")
@Table(name = "regions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "region")

    private String region;
}
