package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cliente;
import modelo.Contato;

public class ContatoDAO {

	private Connection conn;

	public ContatoDAO() throws Exception {
		this.conn = ConnectionMYSQL.createConnectionMySQL();
	}

	public Contato create(Contato contato) throws SQLException {
		String sql = "insert into contato(nome, email, telefone)values(?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setString(1, contato.getNome());
		ps.setString(2, contato.getEmail());
		ps.setInt(3, contato.getTelefone());

		return contato;
	}

	public Contato get(int id) throws SQLException {
		String sql = "select * from contato where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			Contato contato = new Contato(result.getString(2), result.getString(3), result.getInt(4));
			return contato;
		}
		return null;
	}
	
	public Contato update (Contato contato) throws SQLException{
		String sql = "update contato set nome = ?, email = ?, telefone = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
	
		ps.setString(1, contato.getNome());
		ps.setString(2, contato.getEmail());
		ps.setInt(3, contato.getTelefone());

		ps.execute();
		ps.close();

		return contato;	
	}
	
	public Boolean delete(int id) throws SQLException {

		String sql = "delete from contato where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}
		
		return false;
	}
}
