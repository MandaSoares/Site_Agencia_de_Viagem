package modelo;

import java.util.Date;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private int cpf;
	private int telefone;
	private String dataNasc;
	private String sexo;

	public Cliente(String nome, String email, int cpf, int telefone, String dataNasc, String sexo) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public Integer getCPF() {
		return this.cpf;
	}

	public Integer getTelefone() {
		return this.telefone;
	}

	public String getDataNasc() {
		return this.dataNasc;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}
