package com.demo.ec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ec.model.Rol;
import com.demo.ec.repository.RolRepository;
import com.demo.ec.service.IRolService;

@Service
public class RolService implements IRolService {

	@Autowired
	private RolRepository rolRepository;

	@Override
	public Rol save(Rol rol) {
		return this.rolRepository.save(rol);
	}

}
