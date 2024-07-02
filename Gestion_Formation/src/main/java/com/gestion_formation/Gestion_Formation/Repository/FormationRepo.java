package com.gestion_formation.Gestion_Formation.Repository;

import com.gestion_formation.Gestion_Formation.Entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepo extends JpaRepository<Formation, Long> {
}
