package com.demo.ec.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nombreUsuario")
	private String nombreUsuario;

	@Column(name = "nombreCompleto")
	private String nombreCompleto;

	@Column(name = "fechaNacimiento")
	private String fechaNacimiento;

	// Relacion a usuarioRoles
	@OneToMany(mappedBy = "usuario")
	private Set<UsuarioRol> roles;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idConfiguracion")
	private Configuracion configuracion;

}
