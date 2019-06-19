package com.demo.ec.service;

import java.util.List;

import com.demo.ec.model.Usuario;
import com.demo.ec.vo.UsuarioVo;

public interface IUsuarioService {

	Usuario save(UsuarioVo usuarioVo);

	List<Usuario> findAllUsers();

	Usuario findUserioByNombreUsuario(String nombre);
}
