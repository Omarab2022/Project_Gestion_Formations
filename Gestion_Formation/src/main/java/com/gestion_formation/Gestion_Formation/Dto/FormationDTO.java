package com.gestion_formation.Gestion_Formation.Dto;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormationDTO {

	private Long id;
	private Integer capaciteMax;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private String description;
	private Integer duree;
	private String niveau;
	private String nom;
}
