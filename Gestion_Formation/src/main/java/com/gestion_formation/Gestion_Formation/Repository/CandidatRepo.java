package com.gestion_formation.Gestion_Formation.Repository;

import com.gestion_formation.Gestion_Formation.Entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepo extends JpaRepository<Candidat, Long> {

}
