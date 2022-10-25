package com.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class Paginas {

		@GetMapping("/home")
		public String index() {
			return "index";
		}

		@GetMapping("/consultoria")
		public String consultoria() {
			return "consultoria";
		}

		@GetMapping("/pacote_croacia")
		public String pacote_croacia() {
			return "pacote_croacia";
		}
		
		@GetMapping("/pacotes")
		public String pacote() {
			return "pacote";
		}
		
		@GetMapping("/passeios")
		public String passeios() {
			return "passeios";
		}
		
		@GetMapping("/promocoes")
		public String promocoes () {
			return "promocoes";
		}
		
		@GetMapping("/rota_berlim")
		public String rota_berlim () {
			return "rota_berlim";
		}
		
		@GetMapping("/rotas")
		public String rotas() {
			return "rotas";
		}
		
		@GetMapping("/sobre")
		public String sobre() {
			return "sobre";
		}
		
		@GetMapping ("/Sucesso")
		public String sucesso() {
			return "sucesso";
		}
		
		@GetMapping ("/contato")
		public String contato() {
			return "contato/contato";
		}
		
		@GetMapping("/CheckoutPacoteCEMB")
		public String checkoutPacoteCEMB() {
			return "pacotes/CheckoutPacoteCEMB";
		}
		
		@GetMapping ("/CheckoutRotaBerlim")
		public String checkoutRotaBerlim() {
			return "rotas/CheckoutRotaBerlim";
		}
		
		@PostMapping("/formulario")
		public String checkoutPacote() {
			return "sucesso";
		}
	}

