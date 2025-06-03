package com.ecolemanager.ecole_manager.service;

import com.ecolemanager.ecole_manager.entite.StudentCours;
import com.ecolemanager.ecole_manager.repo.StudentCoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentCoursService {

    @Autowired
    private StudentCoursRepo studentCoursRepo;

    // Ajouter une inscription
    public StudentCours saveStudentCours(StudentCours sc) {
        return studentCoursRepo.save(sc);
    }

    // Récupérer toutes les inscriptions
    public List<StudentCours> getAllStudentCours() {
        return studentCoursRepo.findAll();
    }

    // Récupérer une inscription par ID
    public Optional<StudentCours> getStudentCoursById(Long id) {
        return studentCoursRepo.findById(id);
    }

    // Supprimer une inscription
    public void deleteStudentCours(Long id) {
        studentCoursRepo.deleteById(id);
    }
}
