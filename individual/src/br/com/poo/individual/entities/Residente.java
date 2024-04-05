package br.com.poo.individual.entities;

import java.time.LocalDate;

public class Residente {
	
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private LocalDate dataNasc;
	private String formacao;
	private int fkHabilidade;
	
	public Residente() {
		super();
	}

	public Residente(int id, String nome, String cpf, String email, LocalDate dataNasc, String formacao,
			int fkHabilidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.formacao = formacao;
		this.fkHabilidade = fkHabilidade;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public int getFkHabilidade() {
		return fkHabilidade;
	}

	public void setFkHabilidade(int fkHabilidade) {
		this.fkHabilidade = fkHabilidade;
	}
	
}
