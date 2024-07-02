package com.gestion_formation.Gestion_Formation.Controllers;


import com.gestion_formation.Gestion_Formation.Entity.Candidat;
import com.gestion_formation.Gestion_Formation.Entity.Inscription;
import com.gestion_formation.Gestion_Formation.Repository.CandidatRepo;
import com.gestion_formation.Gestion_Formation.Repository.InscriptionRepo;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidatController {

	private CandidatRepo candidatRepo;

	private InscriptionRepo inscriptionRepo;

	public CandidatController(CandidatRepo candidatRepo , InscriptionRepo inscriptionRepo) {
		this.candidatRepo = candidatRepo;
		this.inscriptionRepo = inscriptionRepo;

	}

	// Get all candidats
	@GetMapping("/candidats")
	public List<Candidat> allCandidats(){
		return candidatRepo.findAll();
	}

	@DeleteMapping("/deletecandidats/{id}")
	public void deleteCandidat(@PathVariable Long id) {

		Candidat candidat = candidatRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Candidat not found")) ;

		List<Inscription> candidatInscriptions = inscriptionRepo.findByCandidat(candidat);
		inscriptionRepo.deleteAll(candidatInscriptions);

		candidatRepo.deleteById(id);
	}



}
