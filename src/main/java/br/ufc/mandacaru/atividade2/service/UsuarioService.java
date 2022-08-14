package br.ufc.mandacaru.atividade2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.mandacaru.atividade2.model.Usuario;
import br.ufc.mandacaru.atividade2.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public void save(int id, Usuario entity) {
		if(id != 0) {
			entity.setId(id);
		}
		
		usuarioRepository.save(entity);
	}
	
	public void delete(int id) {
		Usuario usuario = find(id);
		usuarioRepository.delete(usuario);
	}
	
	public Usuario find(int id) {
		if(id < 1) {
			return null;
		}
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		if(usuario.isPresent()) {
			return usuario.get();
		}
		
		return null;
	}
	
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
}
