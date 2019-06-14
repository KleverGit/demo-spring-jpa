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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Set<UsuarioRol> getRoles() {
		return roles;
	}

	public void setRoles(Set<UsuarioRol> roles) {
		this.roles = roles;
	}

	public Configuracion getConfiguracion() {
		return configuracion;
	}

	public void setConfiguracion(Configuracion configuracion) {
		this.configuracion = configuracion;
	}

	
}
