package Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDAO;
import DAO.CompraPacoteDAO;
import DAO.PacoteDAO;
import Model.Cliente;
import Model.CompraPacote;
import Model.Pacote;

@WebServlet("/CheckoutPacoteCEMB")
public class CheckoutPacoteCEMB_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletRequest req;

	public CheckoutPacoteCEMB_Servlet() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		try {

		// Recebendo os dados do formulario via parametro

			// Cliente
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String cpf = request.getParameter("cpf");
		String telefone = request.getParameter("telefone");
		String dataNasc = request.getParameter("dataNasc");
		String sexo = request.getParameter("sexo");
		
		
			// Compra_Pacote
		String formaPagamento = "cartao";
		Double valorPago = 2.22500;
		Double desconto = 0.0;
	
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("yyyy-MM-dd").format(dataHoraAtual);
				
		
		
		// Instanciando o cliente
		Cliente cliente = new Cliente(nome, email, cpf, telefone, dataNasc, sexo);
		
		
			
		// Guardando os dados no Bando de Dados
		ClienteDAO cdao = new ClienteDAO();
		Cliente clienteCriado = cdao.create(cliente);
						
		PacoteDAO pdao = new PacoteDAO();
		Pacote pacote = pdao.get(1);
						
		CompraPacote comprapacote = new CompraPacote(cliente, pacote, formaPagamento, valorPago, desconto, data);
		CompraPacoteDAO cpdao = new CompraPacoteDAO();
		cpdao.create(comprapacote);
		
		// Redirecionando o usuario para a pagina inicial da aplicação.
			response.sendRedirect("Sucesso.jsp");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			response.sendRedirect("Erro.jsp");
		}

	}

}
