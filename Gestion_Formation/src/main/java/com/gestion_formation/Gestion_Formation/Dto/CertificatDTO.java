package com.gestion_formation.Gestion_Formation.Dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CertificatDTO {

	private Long id;
	private String description;
	private String nom;
	private String organismeDelivrance;
	private Integer validite;
	private Long formationId;
}
