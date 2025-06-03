package com.ecolemanager.ecole_manager.repo;

import com.ecolemanager.ecole_manager.entite.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
}
