package com.ecolemanager.ecole_manager.entite;

import jakarta.persistence.Entity;

@Entity
public class Prof extends AppUser {

    private String matricule;

    // Constructeurs
    public Prof() {
        super();
    }

    public Prof(String nom, String matricule) {
        super(nom);
        this.matricule = matricule;
    }

    // Getters / Setters
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
