package br.com.pedrolg.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrolg.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
