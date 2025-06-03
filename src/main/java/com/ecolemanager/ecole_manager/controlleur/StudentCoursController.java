package com.ecolemanager.ecole_manager.controlleur;


import com.ecolemanager.ecole_manager.entite.StudentCours;
import com.ecolemanager.ecole_manager.service.StudentCoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/studentcours")
public class StudentCoursController {

    @Autowired
    private StudentCoursService studentCoursService;

    // Ajouter une nouvelle inscription
    @PostMapping
    public StudentCours addStudentCours(@RequestBody StudentCours sc) {
        return studentCoursService.saveStudentCours(sc);
    }

    // Récupérer toutes les inscriptions
    @GetMapping
    public List<StudentCours> getAllStudentCours() {
        return studentCoursService.getAllStudentCours();
    }

    // Récupérer une inscription par ID
    @GetMapping("/{id}")
    public Optional<StudentCours> getStudentCoursById(@PathVariable Long id) {
        return studentCoursService.getStudentCoursById(id);
    }

    // Supprimer une inscription
    @DeleteMapping("/{id}")
    public void deleteStudentCours(@PathVariable Long id) {
        studentCoursService.deleteStudentCours(id);
    }
}
