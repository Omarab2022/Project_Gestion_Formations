package com.gestion_formation.Gestion_Formation.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Formation")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String nom;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(name = "date_debut")
	private LocalDate dateDebut;

	@Column(name = "date_fin")
	private LocalDate dateFin;

	private Integer duree;

	@Column(length = 50)
	private String niveau;

	@Column(name = "capacite_max")
	private Integer capaciteMax;

	@OneToMany(mappedBy = "formation")
	private Set<Certificat> certificats;

	@OneToMany(mappedBy = "formation")
	private Set<Inscription> inscriptions;
}
