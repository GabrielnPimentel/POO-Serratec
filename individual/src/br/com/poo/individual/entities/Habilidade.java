package br.com.poo.individual.entities;

import java.util.HashMap;
import java.util.Map;

public class Habilidade {

	//Atributos
	private Integer id;
	private String nome;
	private String descricao;
	private Integer fkResidente;
	
	static Map<Integer, Habilidade> mapaHabilidades = new HashMap<>();
	
	//Construtor Default
	public Habilidade() {
		super();
	}

	//Construtor Parametrizado
	public Habilidade(Integer id, String nome, String descricao, Integer fkResidente) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.fkResidente = fkResidente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getFkResidente() {
		return fkResidente;
	}

	public void setFkResidente(Integer fkResidente) {
		this.fkResidente = fkResidente;
	}
	
	public static Map<Integer, Habilidade> getMapaHabilidades() {
		return mapaHabilidades;
	}
/*
	@Override
	public String toString() {
		return "\nHabilidade:\nid=" + id + "\nnome=" + nome + "\ndescricao=" + descricao + "\nfkResidente=" + fkResidente;
	}
		*/
	
	@Override
	public String toString() {
		return "\nHabilidade:" + "\nNome=" + nome + "\nDescricao=" + descricao + "\n";
	}
}
