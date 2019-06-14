package com.demo.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ec.model.Usuario;
import com.demo.ec.service.IUsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@RequestMapping(value = "/saveUsuario")
	public Usuario saveUsuario(@RequestBody() Usuario usuario) {
		return this.usuarioService.save(usuario);
	}
}
