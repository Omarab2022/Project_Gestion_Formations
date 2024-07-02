package com.gestion_formation.Gestion_Formation.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Candidat")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidat {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(nullable = false, length = 50)
		private String nom;

		@Column(nullable = false, length = 50)
		private String prenom;

		@Column(name = "date_naissance")
		private LocalDate dateNaissance;

		@Column(nullable = false, unique = true, length = 100)
		private String email;

		@Column(length = 20)
		private String telephone;

		@Column(columnDefinition = "TEXT")
		private String adresse;

		@Column(name = "niveau_etudes", length = 50)
		private String niveauEtudes;

		@Column(name = "experience_professionnelle", columnDefinition = "TEXT")
		private String experienceProfessionnelle;

		@OneToMany(mappedBy = "candidat")
		private Set<Inscription> inscriptions;


}
