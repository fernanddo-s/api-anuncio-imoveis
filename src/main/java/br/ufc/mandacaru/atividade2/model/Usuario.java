package br.ufc.mandacaru.atividade2.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private String cpf;
	
	private String telefone;
	
	private String endereco;
	
	@OneToMany(mappedBy = "usuario")
	private List<AnuncioImovel> anuncios;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<AnuncioImovel> getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(List<AnuncioImovel> anuncios) {
		this.anuncios = anuncios;
	}

	public Usuario(int id, String nome, String email, String senha, String cpf, String telefone, String endereco,
			List<AnuncioImovel> anuncios) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.anuncios = anuncios;
	}

	public Usuario() {
		super();
	}

}
