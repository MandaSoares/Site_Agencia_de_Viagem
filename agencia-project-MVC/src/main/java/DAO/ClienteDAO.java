package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Connection.ConnectionMySQL;
import Model.Cliente;

public class ClienteDAO {

	private Connection conn;

	public ClienteDAO() throws Exception {
		this.conn = ConnectionMySQL.createConnectionMySQL();
	}

	public Cliente create(Cliente cliente) throws SQLException {
		String sql = "insert into cliente(nome, email, CPF, telefone, dataNasc, sexo)values(?,?,?,?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		ps.setString(1, cliente.getNome());
		ps.setString(2, cliente.getEmail());
		ps.setString(3, cliente.getCPF());
		ps.setString(4, cliente.getTelefone());
		ps.setString(5, cliente.getDataNasc());
		ps.setString(6, cliente.getSexo());

		ps.execute();
		ResultSet rs = ps.getGeneratedKeys();
		
		if (rs.next()) {
		    final int lastId = rs.getInt(1);
			cliente.setId(lastId);
		}
		
		ps.close();

		return cliente;
	}

	public Cliente get(int id) throws SQLException {
		String sql = "select * from cliente where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			Cliente cliente = new Cliente(result.getString(2), result.getString(3), result.getString(4), result.getString(5),
					result.getString(6), result.getString(7));
			cliente.setId(result.getInt(1));
			return cliente;
		}
		return null;
	}

	public Cliente update(Cliente cliente) throws SQLException {
		String sql = "update cliente set nome = ?, email = ?, CPF = ?, telefone = ?, dataNasc = ?, sexo = ? where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setString(1, cliente.getNome());
		ps.setString(2, cliente.getEmail());
		ps.setString(3, cliente.getCPF());
		ps.setString(4, cliente.getTelefone());
		ps.setString(5, cliente.getDataNasc());
		ps.setString(6, cliente.getSexo());
		ps.setInt(7, cliente.getId());

		ps.execute();
		ps.close();

		return cliente;
	}

	public Boolean delete(int id) throws SQLException {

		String sql = "delete from cliente where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}

		return false;
	}

}
