package com.example.iam.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CARRIER")
public class Carrier {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "CARRIER_ID", nullable = false)
    private String carrierId;


}
