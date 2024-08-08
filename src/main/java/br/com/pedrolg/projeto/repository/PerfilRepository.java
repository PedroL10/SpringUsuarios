package br.com.pedrolg.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrolg.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {

}
