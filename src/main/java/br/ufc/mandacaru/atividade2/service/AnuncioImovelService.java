package br.ufc.mandacaru.atividade2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.mandacaru.atividade2.model.AnuncioImovel;
import br.ufc.mandacaru.atividade2.model.Usuario;
import br.ufc.mandacaru.atividade2.repository.AnuncioImovelRepository;
import br.ufc.mandacaru.atividade2.repository.UsuarioRepository;

@Service
public class AnuncioImovelService {
	
	@Autowired
	AnuncioImovelRepository anuncioRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void update(int id, AnuncioImovel entity) {
		AnuncioImovel anuncio = find(id);		
		anuncio.setTitulo(entity.getTitulo());
		anuncio.setEndereco(entity.getEndereco());
		anuncio.setMetrosQuadradosTerreno(entity.getMetrosQuadradosTerreno());
		anuncio.setMetrosQuadradosConstruidos(entity.getMetrosQuadradosConstruidos());
		anuncio.setQuantidadeQuartos(entity.getQuantidadeQuartos());
		anuncio.setQuantidadeBanheiros(entity.getQuantidadeBanheiros());
		anuncio.setQuantidadeVagasGaragem(entity.getQuantidadeVagasGaragem());
		anuncio.setPreco(entity.getPreco());
		anuncio.setStatus(entity.getStatus());
		//anuncio.setDonoAnuncio(entity.getDonoAnuncio());
		if(anuncio.getUsuario() == null) anuncio.setUsuario(entity.getUsuario());
		
		 // if(idade != null) aluno.setIdade(idade);
		
		anuncioRepository.save(anuncio);	
	}
	
	public void save(int usuario_id, AnuncioImovel entity) {
		Usuario usuario = usuarioRepository.findById(usuario_id).get();
		entity.setUsuario(usuario);
		anuncioRepository.save(entity);
	}
	
	public void delete(int id) {
		AnuncioImovel anuncio = find(id);
		anuncioRepository.delete(anuncio);
	}
	
	/*public AnuncioImovel find(int id) {
		if(id < 1) {
			return null;
		}
		
		Optional<AnuncioImovel> anuncio = anuncioRepository.findById(id);
		
		if(anuncio.isPresent()) {
			return anuncio.get();
		}
		
		return null;
	}
	
	public List<AnuncioImovel> findAll(int usuario_id){
		return anuncioRepository.findByUsuarioId(usuario_id);
	}*/
	
	public AnuncioImovel find(int id) {
        if (id < 1) {
            return null;
        }
 
        Optional<AnuncioImovel> an = anuncioRepository.findById(id);
 
        if (an.isPresent()) {
            return an.get();
        }
 
        return null;
    }
 
    public List<AnuncioImovel> findAll(int usuario_id) {
        return anuncioRepository.findByUsuarioId(usuario_id);
    }
	
}
