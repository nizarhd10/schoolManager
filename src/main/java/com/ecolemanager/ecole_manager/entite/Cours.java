package com.ecolemanager.ecole_manager.entite;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private LocalDate date;
    private LocalTime heure; // Heure UTC à gérer via config/application

    @ManyToOne
    @JoinColumn(name = "prof_id")
    private Prof prof;

    @OneToMany(mappedBy = "cours")
    private List<StudentCours> studentCoursList;

    // Constructeurs
    public Cours() {}

    public Cours(String nom, LocalDate date, LocalTime heure, Prof prof) {
        this.nom = nom;
        this.date = date;
        this.heure = heure;
        this.prof = prof;
    }

    // Getters / Setters
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public List<StudentCours> getStudentCoursList() {
        return studentCoursList;
    }

    public void setStudentCoursList(List<StudentCours> studentCoursList) {
        this.studentCoursList = studentCoursList;
    }
}
