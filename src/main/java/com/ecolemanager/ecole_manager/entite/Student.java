package com.ecolemanager.ecole_manager.entite;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student extends AppUser {

    private String numeroAppoge;

    @OneToMany(mappedBy = "student")
    private List<StudentCours> studentCoursList;

    // Constructeurs
    public Student() {
        super();
    }

    public Student(String nom, String numeroAppoge) {
        super(nom);
        this.numeroAppoge = numeroAppoge;
    }

    // Getters et Setters
    public String getNumeroAppoge() {
        return numeroAppoge;
    }

    public void setNumeroAppoge(String numeroAppoge) {
        this.numeroAppoge = numeroAppoge;
    }

    public List<StudentCours> getStudentCoursList() {
        return studentCoursList;
    }

    public void setStudentCoursList(List<StudentCours> studentCoursList) {
        this.studentCoursList = studentCoursList;
    }
}
