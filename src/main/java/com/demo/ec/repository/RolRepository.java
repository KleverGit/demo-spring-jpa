package com.demo.ec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ec.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

}
