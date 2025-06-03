package com.ecolemanager.ecole_manager.service;

import com.ecolemanager.ecole_manager.entite.Prof;
import com.ecolemanager.ecole_manager.repo.ProfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfService {

    @Autowired
    private ProfRepo profRepo;

    public List<Prof> getAllProfs() {
        return profRepo.findAll();
    }

    public Optional<Prof> getProfById(Long id) {
        return profRepo.findById(id);
    }

    public Prof createProf(Prof prof) {
        return profRepo.save(prof);
    }

    public Prof updateProf(Long id, Prof updatedProf) {
        Prof existing = profRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Prof non trouvé avec id : " + id));

        existing.setNom(updatedProf.getNom());
        existing.setMatricule(updatedProf.getMatricule());

        return profRepo.save(existing);
    }

    public void deleteProf(Long id) {
        profRepo.deleteById(id);
    }
}
