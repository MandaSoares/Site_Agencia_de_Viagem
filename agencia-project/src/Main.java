import DAO.ClienteDAO;
import DAO.CompraPacoteDAO;
import DAO.LugaresPacoteDAO;
import DAO.PacoteDAO;
import modelo.Cliente;
import modelo.CompraPacote;
import modelo.LugaresPacote;
import modelo.Pacote;

public class Main {

	public static void main(String[] args) {
		try {
			//Gera uma compra
			/*ClienteDAO clientedao = new ClienteDAO();
			Cliente cliente = clientedao.get(8);
			
			PacoteDAO pacotedao = new PacoteDAO();
			Pacote pacote = pacotedao.get(6);
			
			CompraPacoteDAO comprapacotedao = new CompraPacoteDAO();
			CompraPacote comprapacote = new CompraPacote(cliente, pacote, "Cartão", 950.00, 800.00, "2022-09-05");
			
			comprapacotedao.create(comprapacote);*/
			
			//Criar lugares e vincular com pacote//
			/*PacoteDAO pacotedao = new PacoteDAO();
			Pacote pacote = pacotedao.get(6);
			
			LugaresPacote lugarespacote = new LugaresPacote(pacote, "Bruxelas", "Europa", "Bélgica");
			
			LugaresPacoteDAO lugarespacotedao = new LugaresPacoteDAO();
			lugarespacotedao.create(lugarespacote);*/
			
			// Recupera Compra realizada
			
			CompraPacoteDAO comprapacotedao = new CompraPacoteDAO();
			CompraPacote comprapacote = comprapacotedao.get(7);
			
			System.out.println(comprapacote.getId());
			System.out.println(comprapacote.getCliente().getNome());
			System.out.println(comprapacote.getCliente().getEmail());
			System.out.println(comprapacote.getPacote().getComodidade());
			System.out.println(comprapacote.getPacote().getDocumentacao());
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
