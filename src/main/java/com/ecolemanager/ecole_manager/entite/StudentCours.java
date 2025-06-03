package com.ecolemanager.ecole_manager.entite;

import jakarta.persistence.*;

@Entity
public class StudentCours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;

    // Constructeurs
    public StudentCours() {}

    public StudentCours(Student student, Cours cours) {
        this.student = student;
        this.cours = cours;
    }

    // Getters / Setters
    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }
}
