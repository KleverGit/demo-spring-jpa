package com.demo.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	
	@RequestMapping(value = "/saveUsuario")
	public Usuario saveUuario (Usuario usuario) {
		
	}
}
