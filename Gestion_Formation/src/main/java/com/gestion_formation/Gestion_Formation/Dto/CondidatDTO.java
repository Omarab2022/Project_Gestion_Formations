package com.gestion_formation.Gestion_Formation.Dto;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CondidatDTO {

	private Long id;
	private String adresse;
	private LocalDate dateNaissance;
	private String email;
	private String experienceProfessionnelle;
	private String niveauEtudes;
	private String nom;
	private String prenom;
	private String telephone;
}
