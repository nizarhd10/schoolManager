package com.ecolemanager.ecole_manager.controlleur;

import com.ecolemanager.ecole_manager.entite.Prof;
import com.ecolemanager.ecole_manager.service.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profs")
public class ProfController {

    @Autowired
    private ProfService profService;

    @GetMapping
    public List<Prof> getAllProfs() {
        return profService.getAllProfs();
    }

    @GetMapping("/{id}")
    public Prof getProfById(@PathVariable Long id) {
        return profService.getProfById(id)
                .orElseThrow(() -> new RuntimeException("Prof non trouvé avec l'id : " + id));
    }

    @PostMapping
    public Prof createProf(@RequestBody Prof prof) {
        return profService.createProf(prof);
    }

    @PutMapping("/{id}")
    public Prof updateProf(@PathVariable Long id, @RequestBody Prof prof) {
        return profService.updateProf(id, prof);
    }

    @DeleteMapping("/{id}")
    public void deleteProf(@PathVariable Long id) {
        profService.deleteProf(id);
    }
}
