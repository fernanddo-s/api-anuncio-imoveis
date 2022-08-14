package br.ufc.mandacaru.atividade2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.mandacaru.atividade2.model.Usuario;
import br.ufc.mandacaru.atividade2.service.UsuarioService;

@RestController
@RequestMapping(path = "/api/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@GetMapping(path = "")
	public ResponseEntity<List<Usuario>> findAll() {
		return new ResponseEntity<List<Usuario>>(service.findAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Usuario> find(@PathVariable("id") int id) {
		return new ResponseEntity<Usuario>(service.find(id), HttpStatus.OK);
	}

	/*@GetMapping(path = "/search")
	public ResponseEntity<Usuario> findByName(@RequestParam("name") String name) {
		Usuario usuario = service.findByName(name);
		
		if(usuario != null) {
			return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);	
		} else {
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}
	}*/

	@PostMapping
	public void save(@RequestBody Usuario usuario) {
		service.save(0, usuario);
	}

	@PutMapping(path = "/{id}")
	public void update(@PathVariable("id") int id, @RequestBody Usuario usuario) {
		service.save(id, usuario);
	}

	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}
}
