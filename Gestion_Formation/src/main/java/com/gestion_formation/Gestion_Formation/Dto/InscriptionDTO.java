package com.gestion_formation.Gestion_Formation.Dto;

import com.gestion_formation.Gestion_Formation.Enums.StatutInscription;
import lombok.*;

import java.time.LocalDate;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InscriptionDTO {

	private Long id;
	private LocalDate dateInscription;
	private StatutInscription statut;
	private Long candidatId;
	private Long formationId;


}
