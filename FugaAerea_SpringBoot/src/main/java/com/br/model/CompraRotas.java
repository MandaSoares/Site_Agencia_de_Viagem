package com.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompraRotas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private int cliente;
	@Column(nullable = false)
	private int rotas;
	@Column(nullable = false)
	private String formaPagamento;
	@Column(nullable = false)
	private Double valorPago;
	@Column(nullable = false)
	private Double desconto;
	@Column(nullable = false)
	private String dataCompra;
	@Column(nullable = false)
	private String comGuia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public int getRotas() {
		return rotas;
	}
	public void setRotas(int rotas) {
		this.rotas = rotas;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public String getComGuia() {
		return comGuia;
	}
	public void setComGuia(String comGuia) {
		this.comGuia = comGuia;
	}
	public CompraRotas(int id, int cliente, int rotas, String formaPagamento, Double valorPago, Double desconto,
			String dataCompra, String comGuia) {
		super();
		
		this.id = id;
		this.cliente = cliente;
		this.rotas = rotas;
		this.formaPagamento = formaPagamento;
		this.valorPago = valorPago;
		this.desconto = desconto;
		this.dataCompra = dataCompra;
		this.comGuia = comGuia;
	}
	public CompraRotas() {
		super();
		// TODO Auto-generated constructor stub
	}

}
