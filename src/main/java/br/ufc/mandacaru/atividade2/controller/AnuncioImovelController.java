package br.ufc.mandacaru.atividade2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.mandacaru.atividade2.model.AnuncioImovel;
import br.ufc.mandacaru.atividade2.service.AnuncioImovelService;

@RestController
@RequestMapping(path = "/api")
public class AnuncioImovelController {
	
	@Autowired
	AnuncioImovelService service;

	@GetMapping("/usuarios/{id}/anuncios")
	public ResponseEntity<List<AnuncioImovel>> findAll(@PathVariable(value = "id") int id) {
		return new ResponseEntity<List<AnuncioImovel>>(service.findAll(id), HttpStatus.OK);
	}

	@GetMapping("/anuncios/{id}")
	public ResponseEntity<AnuncioImovel> find(@PathVariable("id") int id) {
		return new ResponseEntity<AnuncioImovel>(service.find(id), HttpStatus.OK);
	}

	@PostMapping("/usuarios/{id}/anuncios")
	public void save(@PathVariable("id") int usuario_id, @RequestBody AnuncioImovel anuncioImovel) {
		service.save(usuario_id, anuncioImovel);
	}

	@PutMapping("/anuncios/{id}")
	public void update(@PathVariable("id") int id, @RequestBody AnuncioImovel anuncioImovel) {
		service.update(id, anuncioImovel);
	}

	@DeleteMapping("/anuncios/{id}")
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}
}
