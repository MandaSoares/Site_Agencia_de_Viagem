package modelo;

public class CompraPacote {

	private int id;
	private Cliente cliente;
	private Pacote pacote;
	private String formaPagamento;
	private Double valorPago;
	private Double desconto;
	private String dataCompra;

	public CompraPacote(Cliente cliente, Pacote pacote, String formaPagamento, Double valorPago, Double desconto,
			String dataCompra) {
		this.cliente = cliente;
		this.pacote = pacote;
		this.formaPagamento = formaPagamento;
		this.valorPago = valorPago;
		this.desconto = desconto;
		this.dataCompra = dataCompra;

	}

	public Cliente getCliente() {
		return cliente;
	}


	public Pacote getPacote() {
		return pacote;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getFormaPagamento() {
		return this.formaPagamento;
	}

	public Double getValorPago() {
		return this.valorPago;
	}

	public Double getDesconto() {
		return this.desconto;
	}

	public String getDataCompra() {
		return this.dataCompra;
	}

}
