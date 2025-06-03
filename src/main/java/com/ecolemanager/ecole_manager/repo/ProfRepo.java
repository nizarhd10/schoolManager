package com.ecolemanager.ecole_manager.repo;

import com.ecolemanager.ecole_manager.entite.Prof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfRepo extends JpaRepository<Prof, Long> {
}
