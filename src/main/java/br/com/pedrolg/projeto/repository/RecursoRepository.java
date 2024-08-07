package br.com.pedrolg.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrolg.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {

}
