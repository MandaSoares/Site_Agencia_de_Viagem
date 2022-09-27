package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.ConnectionMySQL;
import Model.Cliente;
import Model.CompraRotas;
import Model.Rotas;

public class CompraRotasDAO {

		private Connection conn;

		public CompraRotasDAO() throws Exception {
			this.conn = ConnectionMySQL.createConnectionMySQL();
		}

		public CompraRotas create(CompraRotas compraRotas) throws SQLException {

			String sql = "insert into compra_rotas(id_cliente, id_rotas, formaPagamento, valorPago, desconto, dataCompra, comGuia)values(?,?,?,?,?,?,?)";
			PreparedStatement ps = this.conn.prepareStatement(sql);

			ps.setInt(1, compraRotas.getCliente().getId());
			ps.setInt(2, compraRotas.getRotas().getId());
			ps.setString(3, compraRotas.getFormaPagamento());
			ps.setDouble(4, compraRotas.getValorPago());
			ps.setDouble(5, compraRotas.getDesconto());
			ps.setString(6, compraRotas.getDataCompra());
			ps.setString(7, compraRotas.getcomGuia());

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
				
				Cliente cliente = new Cliente(result.getString(9), result.getString(10), result.getString(11), result.getString(12), result.getString(13), result.getString(14));
				Rotas rotas = new Rotas(result.getString(16), result.getInt(17), result.getString(18), result.getString(19), result.getDouble(20), result.getString(21), result.getString(22), result.getString(23));
				
				CompraRotas compraRotas = new CompraRotas(cliente, rotas, result.getString(2), result.getDouble(3), result.getDouble(4),
						result.getString(5), result.getString(6));

				compraRotas.setId(result.getInt(1));
				return compraRotas;
			}
			return null;
		}

		public CompraRotas update (CompraRotas compraRotas) throws SQLException{
			String sql = "update compra_rotas set id_cliente = ?, id_rotas = ?, formaPagamento = ? valorPago = ?, desconto = ?, dataCompra = ?, comGuia? where id = ?";
			PreparedStatement ps = this.conn.prepareStatement(sql);
		
			ps.setInt(1, compraRotas.getRotas().getId());
			ps.setInt(2, compraRotas.getRotas().getId());
			ps.setString(3, compraRotas.getFormaPagamento());
			ps.setDouble(4, compraRotas.getValorPago());
			ps.setDouble(5, compraRotas.getDesconto());
			ps.setString(6, compraRotas.getDataCompra());
			ps.setString(7, compraRotas.getcomGuia());

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
