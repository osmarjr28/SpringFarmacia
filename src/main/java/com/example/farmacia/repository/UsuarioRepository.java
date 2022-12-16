package com.example.farmacia.repository;

import java.util.Optional;

import com.example.farmacia.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByUsuarioContainingIgnoreCase(String usuario);

}
