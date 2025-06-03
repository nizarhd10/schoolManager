package com.ecolemanager.ecole_manager.repo;

import com.ecolemanager.ecole_manager.entite.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepo extends JpaRepository<Cours, Long> {
}
