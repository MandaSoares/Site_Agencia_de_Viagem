package modelo;

public class Contato {

	private int id;
	private String nome;
	private String email;
	private int telefone;

	public Contato(String nome, String email, int telefone) {
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

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public Integer getTelefone() {
		return this.telefone;

	}
}
