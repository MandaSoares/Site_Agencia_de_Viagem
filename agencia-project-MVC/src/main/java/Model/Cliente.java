package Model;

import java.util.Date;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private String dataNasc;
	private String sexo;

	public Cliente(String nome, String email, String cpf, String telefone, String dataNasc, String sexo) {
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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
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

	public String getCPF() {
		return this.cpf;
	}

	public String getTelefone() {
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
