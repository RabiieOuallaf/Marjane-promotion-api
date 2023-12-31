package com.marjane.marjanepromotionrestapi.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "CentralAdmin")
@Table(name = "central_adminstrator")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CentralAdmin {
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

}
