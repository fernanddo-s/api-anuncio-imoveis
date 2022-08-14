package br.ufc.mandacaru.atividade2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.mandacaru.atividade2.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	/*Usuario findFirstByName(String name);*/

}
