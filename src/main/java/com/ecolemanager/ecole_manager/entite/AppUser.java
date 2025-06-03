package com.ecolemanager.ecole_manager.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    // Constructeur par défaut
    public AppUser() {}

    // Constructeur avec paramètre
    public AppUser(String nom) {
        this.nom = nom;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Optionnel : toString pour debug
    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
