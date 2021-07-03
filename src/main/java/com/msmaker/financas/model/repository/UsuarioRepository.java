package com.msmaker.financas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.financas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// spring data ja tem uma implementação genérica
	//Query methods
	//Optional<Usuario> findByEmail(String email);
	
	boolean existsByEmail(String email);
	
	Optional<Usuario> findByEmail(String email);

}
