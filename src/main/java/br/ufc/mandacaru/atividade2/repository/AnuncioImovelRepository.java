package br.ufc.mandacaru.atividade2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.mandacaru.atividade2.model.AnuncioImovel;

public interface AnuncioImovelRepository extends JpaRepository<AnuncioImovel, Integer>{
	
	List<AnuncioImovel> findByUsuarioId(int id);
	
}
