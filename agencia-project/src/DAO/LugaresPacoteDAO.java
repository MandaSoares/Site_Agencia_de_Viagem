package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cliente;
import modelo.LugaresPacote;

public class LugaresPacoteDAO {

	private Connection conn;

	public LugaresPacoteDAO() throws Exception {
		this.conn = ConnectionMYSQL.createConnectionMySQL();
	}

	public LugaresPacote create(LugaresPacote lugaresPacote) throws SQLException {
		String sql = "insert into lugares_pacote(id_pacote, cidade, pais, continente)values(?,?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, lugaresPacote.getPacote().getId());
		ps.setString(2, lugaresPacote.getCidade());
		ps.setString(3, lugaresPacote.getPais());
		ps.setString(4, lugaresPacote.getContinente());
		
		ps.execute();
		ps.close();
		
		return lugaresPacote;

	}
	
	public LugaresPacote get(int id) throws SQLException {
		String sql = "select * from lugares_pacote where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			LugaresPacote lugaresPacote = new LugaresPacote(null, result.getString(2), result.getString(3), result.getString(6));
			//return lugaresPacote;
		}
		return null;
	}
	
	public LugaresPacote update (LugaresPacote lugaresPacote) throws SQLException{
		String sql = "update lugares_pacote set cidade = ?, pais = ?, continente = ? where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
	
		ps.setString(1, lugaresPacote.getCidade());
		ps.setString(2, lugaresPacote.getPais());
		ps.setString(3, lugaresPacote.getContinente());
		
		return lugaresPacote;
	}
	
	public Boolean delete(int id) throws SQLException {

		String sql = "delete from lugares_pacote where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}
		
		return false;
	}
	
}
