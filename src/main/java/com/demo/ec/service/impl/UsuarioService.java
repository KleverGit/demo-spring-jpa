package com.demo.ec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ec.model.Rol;
import com.demo.ec.model.Usuario;
import com.demo.ec.model.UsuarioRol;
import com.demo.ec.repository.UsuarioRepository;
import com.demo.ec.repository.UsuarioRolRepository;
import com.demo.ec.service.IUsuarioService;
import com.demo.ec.vo.UsuarioVo;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepo;

	@Autowired
	private UsuarioRolRepository usuarioRolRepo;

	@Autowired
	private RolService rolService;

	@Override
	public Usuario save(UsuarioVo usuarioVo) {
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(usuarioVo.getNombreUsuario());
		usuario.setNombreCompleto(usuarioVo.getNombreCompleto());
		usuario.setFechaNacimiento(usuarioVo.getFechaNacimiento());
		
		Usuario usuarioResp = this.usuarioRepo.save(usuario);
		if (usuarioResp !=null) {
			if (usuarioVo.getIdsRol() != null && usuarioVo.getIdsRol().size() > 0) {
				for (Long idRol : usuarioVo.getIdsRol()) {
					Rol rol = this.rolService.findById(idRol);
					this.usuarioRolRepo.save(new UsuarioRol(usuarioResp, rol));
				}
			}
		}
		
		return usuarioResp;
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
