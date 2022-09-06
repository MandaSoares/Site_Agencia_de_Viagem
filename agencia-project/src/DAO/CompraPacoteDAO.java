package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cliente;
import modelo.CompraPacote;
import modelo.Pacote;
import modelo.Rotas;

public class CompraPacoteDAO {

	private Connection conn;

	public CompraPacoteDAO() throws Exception {
		this.conn = ConnectionMYSQL.createConnectionMySQL();
	}

	public CompraPacote create(CompraPacote compraPacote) throws SQLException {

		String sql = "insert into compra_pacote(id_cliente, id_pacote, formaPagamento, valorPago, desconto, dataCompra)values(?,?,?,?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, compraPacote.getCliente().getId());
		ps.setInt(2, compraPacote.getPacote().getId());
		ps.setString(3, compraPacote.getFormaPagamento());
		ps.setDouble(4, compraPacote.getValorPago());
		ps.setDouble(5, compraPacote.getDesconto());
		ps.setString(6, compraPacote.getDataCompra());

		ps.execute();
		ps.close();

		return compraPacote;
	}
	
	public CompraPacote get(int id) throws SQLException {
		String sql = "Select * from compra_pacote as cp inner join cliente as c inner join pacote as p on c.id = cp.id_cliente and p.id = cp.id_pacote and cp.id=?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			
			Cliente cliente = new Cliente(result.getString(9), result.getString(10), result.getInt(11), result.getInt(12), result.getString(13), result.getString(14));
			Pacote pacote = new Pacote(result.getInt(16), result.getString(17), result.getString(18), result.getString(19), result.getString(20), result.getString(21), result.getDouble(22), result.getString(23), result.getString(24), result.getString(25));
			
			CompraPacote compraPacote = new CompraPacote(cliente, pacote, result.getString(4), result.getDouble(5), result.getDouble(6),
					result.getString(7));

			compraPacote.setId(result.getInt(1));
			return compraPacote;
		}
		return null;
	}

	public CompraPacote update (CompraPacote compraPacote) throws SQLException{
		String sql = "update compra_pacote set formaPagamento = ? valorPago = ?, desconto = ?, dataCompra = ? where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
	
		ps.setString(1, compraPacote.getFormaPagamento());
		ps.setDouble(2, compraPacote.getValorPago());
		ps.setDouble(3, compraPacote.getDesconto());
		ps.setString(4, compraPacote.getDataCompra());
		ps.setInt(9, compraPacote.getId());

		ps.execute();
		ps.close();

		return compraPacote;	
	}
	
	public Boolean delete(int id) throws SQLException {

		String sql = "delete from compra_pacote where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}

		return false;
	}

}
