package com.uns.proyectspring2.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uns.proyectspring2.entidades.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
    Optional<Usuario> findOneByEmail(String email);
}
