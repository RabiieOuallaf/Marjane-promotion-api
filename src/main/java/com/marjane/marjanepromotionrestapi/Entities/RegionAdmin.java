package com.marjane.marjanepromotionrestapi.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "RegionAdmin")
@Table(name = "region_adminstrator")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegionAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "fullname")

    private String fullname;

    @Basic
    @Column(name = "email")

    private String email;

    @Basic
    @Column(name = "password")

    private String password;

    @OneToOne
    @JoinColumn(name = "region_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "region_adminstrator_region_fkey"))
    private Regions region;
}
