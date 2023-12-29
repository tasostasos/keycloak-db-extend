package com.example.iam.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SECURITY_PIN")
public class SecurityPIN {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "VALUE", nullable = false)
    String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
