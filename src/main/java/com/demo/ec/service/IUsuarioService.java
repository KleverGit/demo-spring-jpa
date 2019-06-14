package com.demo.ec.service;

import java.util.List;

import com.demo.ec.model.Usuario;

public interface IUsuarioService {

	Usuario save(Usuario usuario);

	List<Usuario> findAllUsers();

	Usuario findUserioByNombreUsuario(String nombre);
}
