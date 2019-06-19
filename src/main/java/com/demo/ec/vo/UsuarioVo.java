package com.demo.ec.vo;

import java.util.ArrayList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioVo {
	private String nombreUsuario;
	private String nombreCompleto;
	private String fechaNacimiento;
	private String descripcionRol;
	private ArrayList<Long> idsRol;
}
