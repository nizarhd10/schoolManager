package com.ecolemanager.ecole_manager.entite;

import jakarta.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("PROF")
public class Prof extends AppUser {

    private String matricule;

    @OneToMany(mappedBy = "prof")
    private List<Cours> coursList;

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

    public List<Cours> getCoursList() {
        return coursList;
    }

    public void setCoursList(List<Cours> coursList) {
        this.coursList = coursList;
    }
}
