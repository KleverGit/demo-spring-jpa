package com.demo.ec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.ec.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query("SELECT u FROM Usuario u LEFT JOIN UsuarioRol ur WHERE u.nombreUsuario = :nombreUsuario")
	Usuario findUserioByNombreUsuario(@Param("nombreUsuario") String nombreUsuario);
}
