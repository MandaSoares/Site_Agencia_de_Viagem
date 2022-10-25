package com.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String telefone;
	
	public Contato() {
        super();
    }

	public Contato(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public String getTelefone() {
		return this.telefone;

	}
	
	 @Override
	    public String toString() {
	        return "Contato [nome=" + nome + ", email=" + email + ", telefone=" + telefone +"]";
	    }
}
