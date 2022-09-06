package modelo;

public class Rotas {

	private int id;
	private int duracao;
	private String programa;
	private String hospedagem;
	private String roteiro;
	private Double valor;
	private String destaqueRotas;
	private String rotasComGuia;
	private String rotasSelfDrive;

	public Rotas(int duracao, String programa, String hospedagem, String roteiro, Double valor, String destaqueRotas,
			String rotasComGuia, String rotasSelfDrive) {

		this.duracao = duracao;
		this.programa = programa;
		this.hospedagem = hospedagem;
		this.roteiro = roteiro;
		this.valor = valor;
		this.destaqueRotas = destaqueRotas;
		this.rotasComGuia = rotasComGuia;
		this.rotasSelfDrive = rotasSelfDrive;

	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public void setHospedagem(String hospedagem) {
		this.hospedagem = hospedagem;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setDestaqueRotas(String destaqueRotas) {
		this.destaqueRotas = destaqueRotas;
	}

	public void setRotasComGuia(String rotasComGuia) {
		this.rotasComGuia = rotasComGuia;
	}

	public void setRotasSelfDrive(String rotasSelfDrive) {
		this.rotasSelfDrive = rotasSelfDrive;
	}
	
	public Integer getId() {
		return this.id;
	}

	public Integer getDuracao() {
		return this.duracao;
	}

	public String getPrograma() {
		return this.programa;
	}

	public String getHospedagem() {
		return this.hospedagem;
	}

	public String getRoteiro() {
		return this.roteiro;
	}

	public Double getValor() {
		return this.valor;
	}

	public String getDestaqueRotas() {
		return this.destaqueRotas;
	}

	public String getRotasComGuia() {
		return this.rotasComGuia;
	}

	public String getRotasSelfDrive() {
		return this.rotasSelfDrive;
	}

}
