package com.gestion_formation.Gestion_Formation.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Certificat")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Certificat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String nom;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(name = "organisme_delivrance", length = 100)
	private String organismeDelivrance;

	private Integer validite;


	@ManyToOne
	@JoinColumn(name = "formation_id")
	private Formation formation;


}
