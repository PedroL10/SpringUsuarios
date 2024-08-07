package br.com.pedrolg.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrolg.projeto.dto.RecursoDTO;
import br.com.pedrolg.projeto.entity.RecursoEntity;
import br.com.pedrolg.projeto.repository.RecursoRepository;

@Service
public class RecursoService {
	
	@Autowired
	private RecursoRepository recursoRepository;
	
	public List<RecursoDTO> listarTodos(){
		List<RecursoEntity> recursos = recursoRepository.findAll();
		return recursos.stream().map(RecursoDTO::new).toList();
	}
	
	public void inserir(RecursoDTO recurso) {
		RecursoEntity recursoEntity = new RecursoEntity(recurso);
		recursoRepository.save(recursoEntity);
	}
	
	public RecursoDTO alterar(RecursoDTO recurso) {
		RecursoEntity recursoEntity = new RecursoEntity(recurso);
		return new RecursoDTO(recursoRepository.save(recursoEntity));
	}
	
	public void excluir(Long  id) {
		RecursoEntity recurso = recursoRepository.findById(id).get();
		recursoRepository.delete(recurso);
	}
	
	public RecursoDTO buscarPorId(Long id) {
		return new RecursoDTO(recursoRepository.findById(id).get());
	}
	

}
