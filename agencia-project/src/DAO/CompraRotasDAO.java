package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cliente;
import modelo.CompraPacote;
import modelo.CompraRotas;
import modelo.Pacote;
import modelo.Rotas;

public class CompraRotasDAO {

	private Connection conn;

	public CompraRotasDAO() throws Exception {
		this.conn = ConnectionMYSQL.createConnectionMySQL();
	}

	public CompraRotas create(CompraRotas compraRotas) throws SQLException {

		String sql = "insert into pacote(formaPagamento, valorPago, desconto, dataCompra)values(?,?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setString(1, compraRotas.getFormaPagamento());
		ps.setDouble(2, compraRotas.getValorPago());
		ps.setDouble(3, compraRotas.getDesconto());
		ps.setString(4, compraRotas.getDataCompra());

		ps.execute();
		ps.close();

		return compraRotas;
	}
	
	public CompraRotas get(int id) throws SQLException {

		String sql = "Select * from compra_rotas as cp inner join cliente as c inner join rotas as p on c.id = cp.id_cliente and p.id = cp.id_rotas and cp.id=?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			
			Cliente cliente = new Cliente(result.getString(9), result.getString(10), result.getInt(11), result.getInt(12), result.getString(13), result.getString(14));
			Rotas rotas = new Rotas(result.getInt(16), result.getString(17), result.getString(18), result.getString(19), result.getDouble(20), result.getString(21), result.getString(22), result.getString(23));
			
			CompraRotas compraRotas = new CompraRotas(cliente, rotas, result.getString(2), result.getDouble(3), result.getDouble(4),
					result.getString(5));

			compraRotas.setId(result.getInt(1));
			return compraRotas;
		}
		return null;
	}

	public CompraRotas update (CompraRotas compraRotas) throws SQLException{
		String sql = "update compra_rotas set formaPagamento = ? valorPago = ?, desconto = ?, dataCompra = ? where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
	
		ps.setString(1, compraRotas.getFormaPagamento());
		ps.setDouble(2, compraRotas.getValorPago());
		ps.setDouble(3, compraRotas.getDesconto());
		ps.setString(4, compraRotas.getDataCompra());

		ps.execute();
		ps.close();

		return compraRotas;
	}
	
	public Boolean delete(int id) throws SQLException {

		String sql = "delete from compra_rotas where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}

		return false;
	}
}
