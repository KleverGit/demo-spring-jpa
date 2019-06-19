package com.demo.ec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "usuarioRol")
public class UsuarioRol {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne()
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	@ManyToOne()
	@JoinColumn(name = "idRol")
	private Rol rol;

	public UsuarioRol(Usuario usuario, Rol rol) {
		this.usuario = usuario;
		this.rol = rol;
	}

}
