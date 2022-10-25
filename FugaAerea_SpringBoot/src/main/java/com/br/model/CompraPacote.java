package com.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompraPacote {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(nullable = false)
		private int cliente;
		@Column(nullable = false)
		private int pacote;
		@Column(nullable = false)
		private String formaPagamento;
		@Column(nullable = false)
		private Double valorPago;
		@Column(nullable = false)
		private Double desconto;
		@Column(nullable = false)
		private String dataCompra;
		public CompraPacote() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CompraPacote(int id, int cliente, int pacote, String formaPagamento, Double valorPago, Double desconto,
				String dataCompra) {
			super();
			this.id = id;
			this.cliente = cliente;
			this.pacote = pacote;
			this.formaPagamento = formaPagamento;
			this.valorPago = valorPago;
			this.desconto = desconto;
			this.dataCompra = dataCompra;
		}
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
		public int getPacote() {
			return pacote;
		}
		public void setPacote(int pacote) {
			this.pacote = pacote;
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

}
