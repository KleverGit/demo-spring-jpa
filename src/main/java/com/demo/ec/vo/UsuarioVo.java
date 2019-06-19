package com.demo.ec.vo;

import java.util.ArrayList;

public class UsuarioVo {
	private String nombreUsuario;
	private String nombreCompleto;
	private String fechaNacimiento;
	private String descripcionRol;
	private ArrayList<Long> idsRol;

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

	public String getDescripcionRol() {
		return descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}

	public ArrayList<Long> getIdsRol() {
		return idsRol;
	}

	public void setIdsRol(ArrayList<Long> idsRol) {
		this.idsRol = idsRol;
	}
	
	

}
