package modelo;

public class CompraRotas {

	private int id;
	private Cliente cliente;
	private Rotas rotas;
	private String formaPagamento;
	private Double valorPago;
	private Double desconto;
	private String dataCompra;

	public CompraRotas(Cliente cliente, Rotas rotas, String formaPagamento, Double valorPago, Double desconto,
			String dataCompra) {
		this.cliente = cliente;
		this.rotas = rotas;
		this.formaPagamento = formaPagamento;
		this.valorPago = valorPago;
		this.desconto = desconto;
		this.dataCompra = dataCompra;

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setRotas(Rotas rotas) {
		this.rotas = rotas;
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
