package Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDAO;
import DAO.CompraPacoteDAO;
import DAO.CompraRotasDAO;
import DAO.PacoteDAO;
import DAO.RotasDAO;
import Model.Cliente;
import Model.CompraPacote;
import Model.CompraRotas;
import Model.Pacote;
import Model.Rotas;

@WebServlet("/CheckoutRotaBerlim")
public class CheckoutRotaBerlim_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletRequest req;
       
    public CheckoutRotaBerlim_Servlet() {
        super();
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	try {

    		// Recebendo os dados do formulario via parametro

    			// Cliente
    		String nome = request.getParameter("nome");
    		String email = request.getParameter("email");
    		String cpf = request.getParameter("cpf");
    		String telefone = request.getParameter("telefone");
    		String dataNasc = request.getParameter("dataNasc");
    		String sexo = request.getParameter("sexo");
    		
    			// Compra_Rotas
    		String formaPagamento = "cartao";
    		Double valorPago = 2.22500;
    		Double desconto = 0.0;
   
    		Date dataHoraAtual = new Date();
    		String data = new SimpleDateFormat("yyyy-MM-dd").format(dataHoraAtual);
    		
    		String comGuia = request.getParameter("comGuia");
    				
    		
    		
    		// Instanciando o cliente
    		Cliente cliente = new Cliente(nome, email, cpf, telefone, dataNasc, sexo);
    		
    			
    		// Guardando os dados no Bando de Dados
    		ClienteDAO cdao = new ClienteDAO();
    		Cliente clienteCriado = cdao.create(cliente);
    						
    		RotasDAO rdao = new RotasDAO();
    		Rotas rotas = rdao.get(1);
    						
    		CompraRotas comprarotas = new CompraRotas(cliente, rotas, formaPagamento, valorPago, desconto, data, comGuia);
        		
    		CompraRotasDAO crdao = new CompraRotasDAO();
    		crdao.create(comprarotas);
    		
    		// Redirecionando o usuario para a pagina inicial da aplicação.
    			response.sendRedirect("Sucesso.jsp");
    			
    		} catch (Exception e) {
    			System.out.println(e.getMessage());
    			e.printStackTrace();
    			response.sendRedirect("Erro.jsp");
    		}

    	}
    	
	}

