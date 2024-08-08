package br.com.pedrolg.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrolg.projeto.entity.PerfilUsuarioEntity;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {

}
