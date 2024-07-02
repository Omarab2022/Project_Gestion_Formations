package com.gestion_formation.Gestion_Formation.Entity;


import com.gestion_formation.Gestion_Formation.Enums.StatutInscription;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Inscription")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;

	@ManyToOne
	@JoinColumn(name = "candidat_id")
	private Candidat candidat;

	@ManyToOne
	@JoinColumn(name = "formation_id")
	private Formation formation;

	@Column(name = "date_inscription")
	private LocalDate dateInscription;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private StatutInscription statut;



}
