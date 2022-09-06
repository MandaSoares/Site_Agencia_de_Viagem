package modelo;

public class LugaresPacote {

	private int id;
	private String cidade;
	private String pais;
	private String continente;
	private Pacote pacote;

	public LugaresPacote(Pacote pacote, String cidade, String pais, String continente) {
		this.pacote = pacote;
		this.cidade = cidade;
		this.pais = pais;
		this.continente = continente;
	}

	public int getId() {
		return id;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getCidade() {
		return this.cidade;
	}

	public String getPais() {
		return this.pais;
	}

	public String getContinente() {
		return this.continente;
	}

}
