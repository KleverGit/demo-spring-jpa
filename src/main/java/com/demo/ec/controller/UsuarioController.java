package com.demo.ec.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ec.model.Rol;
import com.demo.ec.model.Usuario;
import com.demo.ec.service.IRolService;
import com.demo.ec.service.IUsuarioService;
import com.demo.ec.vo.UsuarioVo;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IRolService rolService;
	
	@RequestMapping(value = "/saveUsuario")
	public Usuario saveUsuario(@RequestBody() UsuarioVo usuarioVo) {
		return this.usuarioService.save(usuarioVo);
	}
	
	@RequestMapping(value = "/saveRol")
	public Set<Rol> saveRoles(@RequestBody() Set<Rol> roles) {
		return this.rolService.save(roles);
	}
}
