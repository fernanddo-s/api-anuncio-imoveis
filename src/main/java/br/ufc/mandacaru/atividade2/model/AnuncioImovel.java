package br.ufc.mandacaru.atividade2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AnuncioImovel {

	@Id
	@GeneratedValue
	private int id;
	
	private String titulo;
	
	private String endereco;
	
	private double metrosQuadradosTerreno;

	private double metrosQuadradosConstruidos;

	private int quantidadeQuartos;

	private int quantidadeBanheiros;

	private int quantidadeVagasGaragem;

	private double preco;
	
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	@JsonIgnore
	private Usuario usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getMetrosQuadradosTerreno() {
		return metrosQuadradosTerreno;
	}

	public void setMetrosQuadradosTerreno(double metrosQuadradosTerreno) {
		this.metrosQuadradosTerreno = metrosQuadradosTerreno;
	}

	public double getMetrosQuadradosConstruidos() {
		return metrosQuadradosConstruidos;
	}

	public void setMetrosQuadradosConstruidos(double metrosQuadradosConstruidos) {
		this.metrosQuadradosConstruidos = metrosQuadradosConstruidos;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public int getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public void setQuantidadeBanheiros(int quantidadeBanheiros) {
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public int getQuantidadeVagasGaragem() {
		return quantidadeVagasGaragem;
	}

	public void setQuantidadeVagasGaragem(int quantidadeVagasGaragem) {
		this.quantidadeVagasGaragem = quantidadeVagasGaragem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public AnuncioImovel(int id, String titulo, String endereco, double metrosQuadradosTerreno,
			double metrosQuadradosConstruidos, int quantidadeQuartos, int quantidadeBanheiros,
			int quantidadeVagasGaragem, double preco, String status, Usuario usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.endereco = endereco;
		this.metrosQuadradosTerreno = metrosQuadradosTerreno;
		this.metrosQuadradosConstruidos = metrosQuadradosConstruidos;
		this.quantidadeQuartos = quantidadeQuartos;
		this.quantidadeBanheiros = quantidadeBanheiros;
		this.quantidadeVagasGaragem = quantidadeVagasGaragem;
		this.preco = preco;
		this.status = status;
		this.usuario = usuario;
	}

	public AnuncioImovel() {
		super();
	}
	
}
