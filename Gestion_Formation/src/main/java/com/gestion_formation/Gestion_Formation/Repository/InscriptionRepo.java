package com.gestion_formation.Gestion_Formation.Repository;

import com.gestion_formation.Gestion_Formation.Entity.Candidat;
import com.gestion_formation.Gestion_Formation.Entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscriptionRepo extends JpaRepository<Inscription, Long> {

	List<Inscription> findByCandidat(Candidat candidat);
}
