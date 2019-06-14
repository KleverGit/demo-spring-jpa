package com.demo.ec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.ec.model.Usuario;
import com.demo.ec.repository.UsuarioRepository;
import com.demo.ec.service.IUsuarioService;

public class UsusarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	public Usuario save(Usuario usuario) {
		return this.usuarioRepo.save(usuario);
	}
	
	@Override
	public List<Usuario> findAllUsers() {
		return this.usuarioRepo.findAll();
	}

	@Override
	public Usuario findUserioByNombreUsuario(String nombre) {
		return this.usuarioRepo.findUserioByNombreUsuario(nombre);
	}

}
