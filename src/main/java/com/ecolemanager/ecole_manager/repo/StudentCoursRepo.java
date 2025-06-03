package com.ecolemanager.ecole_manager.repo;

import com.ecolemanager.ecole_manager.entite.StudentCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCoursRepo extends JpaRepository<StudentCours, Long> {
}
