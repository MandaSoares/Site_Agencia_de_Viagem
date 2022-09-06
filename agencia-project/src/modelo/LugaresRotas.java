package modelo;

public class LugaresRotas {
	
	private int id;
	private String cidade;
	private String pais;
	private String continente;

	public LugaresRotas(String cidade, String pais, String continente) {
		this.cidade = cidade;
		this.pais = pais;
		this.continente = continente;
		
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
