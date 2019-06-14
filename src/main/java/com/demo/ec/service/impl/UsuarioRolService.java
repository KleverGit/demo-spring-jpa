package com.demo.ec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ec.model.UsuarioRol;
import com.demo.ec.repository.UsuarioRolRepository;
import com.demo.ec.service.IRolUsuarioService;

@Service
public class UsuarioRolService implements IRolUsuarioService {

	@Autowired
	private UsuarioRolRepository usuarioRolRepository;

	@Override
	public UsuarioRol save(UsuarioRol usuariorol) {
		return this.usuarioRolRepository.save(usuariorol);
	}

}
