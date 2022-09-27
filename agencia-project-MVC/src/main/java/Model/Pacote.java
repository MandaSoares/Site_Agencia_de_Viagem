package Model;

public class Pacote {
	
	private int id;
	private int duracao;
	private String dataSaida;
	private String hospedagem;
	private String comodidade;
	private String roteiro;
	private String refeicoes;
	private Double valor;
	private String documentacao;
	private String guia;
	private String programaDiario;

	public Pacote(int duracao, String dataSaida, String hospedagem, String comodidade, String roteiro, String refeicoes,
			Double valor, String documentacao, String guia, String programaDiario) {

		this.duracao = duracao;
		this.dataSaida = dataSaida;
		this.hospedagem = hospedagem;
		this.comodidade = comodidade;
		this.roteiro = roteiro;
		this.refeicoes = refeicoes;
		this.valor = valor;
		this.documentacao = documentacao;
		this.guia = guia;
		this.programaDiario = programaDiario;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public void setHospedagem(String hospedagem) {
		this.hospedagem = hospedagem;
	}

	public void setComodidade(String comodidade) {
		this.comodidade = comodidade;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public void setRefeicoes(String refeicoes) {
		this.refeicoes = refeicoes;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setDocumentacao(String documentacao) {
		this.documentacao = documentacao;
	}

	public void setGuia(String guia) {
		this.guia = guia;
	}

	public void setProgramaDiario(String programaDiario) {
		this.programaDiario = programaDiario;
	}
	

	public Integer getDuracao() {
		return this.duracao;
	}

	public String getDataSaida() {
		return this.dataSaida;
	}

	public String getHospedagem() {
		return this.hospedagem;
	}

	public String getComodidade() {
		return this.comodidade;
	}

	public String getRoteiro() {
		return this.roteiro;
	}

	public String getRefeicoes() {
		return this.refeicoes;
	}

	public Double getValor() {
		return this.valor;
	}

	public String getDocumentacao() {
		return this.documentacao;
	}

	public String getGuia() {
		return this.guia;
	}

	public String getProgramaDiario() {
		return this.programaDiario;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

}
