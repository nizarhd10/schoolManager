package com.ecolemanager.ecole_manager.service;

import com.ecolemanager.ecole_manager.entite.Cours;
import com.ecolemanager.ecole_manager.repo.CoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursService {

    @Autowired
    private CoursRepo coursRepo;

    public List<Cours> getAllCours() {
        return coursRepo.findAll();
    }

    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    public Cours getCoursById(Long id) {
        return coursRepo.findById(id).orElse(null);
    }

    public void deleteCours(Long id) {
        coursRepo.deleteById(id);
    }
}
