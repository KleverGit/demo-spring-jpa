package com.demo.ec.service.impl;

import java.util.HashSet;
import java.util.Set;

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
	public Set<Rol> save(Set<Rol> roles) {
		Set<Rol> rolesSave = new HashSet<>(); 
		for (Rol rolSave : roles) {
			rolesSave.add(this.rolRepository.save(rolSave)); 
		}
		return rolesSave;
	}
	
	public Rol findById (Long id) {
		return this.rolRepository.findById(id).get();
	}

}
