package com.ecolemanager.ecole_manager.controlleur;

import com.ecolemanager.ecole_manager.entite.Cours;
import com.ecolemanager.ecole_manager.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {

    @Autowired
    private CoursService coursService;

    @GetMapping
    public List<Cours> getAll() {
        return coursService.getAllCours();
    }

    @PostMapping
    public Cours add(@RequestBody Cours cours) {
        return coursService.addCours(cours);
    }

    @GetMapping("/{id}")
    public Cours getById(@PathVariable Long id) {
        return coursService.getCoursById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        coursService.deleteCours(id);
    }
}
