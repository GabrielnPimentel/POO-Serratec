package br.com.poo.individual.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Residente {
	
	//Atributos
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private LocalDate dataNasc;
	private String formacao;
	private Integer fkHabilidade;
	
	static Map<Integer, Residente> mapaResidentes = new HashMap<>();
	
	//Construtor Default
	public Residente() {
		super();
	}

	//Construtor Parametrizado
	public Residente(Integer id, String nome, String cpf, String email, LocalDate dataNasc, String formacao,
			Integer fkHabilidade) {
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

	public void setId(Integer id) {
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

	public void setFkHabilidade(Integer fkHabilidade) {
		this.fkHabilidade = fkHabilidade;
	}
	
	public static Map<Integer, Residente> getMapaResidentes() {
		return mapaResidentes;
	}

	@Override
	public String toString() {
		return "\nResidente:\nid=" + id + "\nnome=" + nome + "\ncpf=" + cpf + ", \nemail=" + email + ", d\nataNasc=" + dataNasc
				+ "\nformacao=" + formacao + "\nfkHabilidade=" + fkHabilidade;
	}
		
}
