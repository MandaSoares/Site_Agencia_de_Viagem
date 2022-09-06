package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.LugaresPacote;
import modelo.LugaresRotas;

public class LugaresRotasDAO {

	private Connection conn;

	public LugaresRotasDAO() throws Exception {
		this.conn = ConnectionMYSQL.createConnectionMySQL();
	}

	public LugaresRotas create(LugaresRotas lugaresRotas) throws SQLException {
		String sql = "insert into lugaresRotas(cidade, pais, continente)values(?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setString(1, lugaresRotas.getCidade());
		ps.setString(2, lugaresRotas.getPais());
		ps.setString(3, lugaresRotas.getContinente());

		return lugaresRotas;

	}
	
	public LugaresRotas get(int id) throws SQLException {
		String sql = "select * from lugares_rotas where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			LugaresRotas lugaresRotas = new LugaresRotas(result.getString(2), result.getString(3), result.getString(6));
			return lugaresRotas;
		}
		return null;
	}
	
	public LugaresRotas update (LugaresRotas lugaresRotas) throws SQLException{
		String sql = "update lugares_rotas set cidade = ?, pais = ?, continente = ? where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
	
		ps.setString(1, lugaresRotas.getCidade());
		ps.setString(2, lugaresRotas.getPais());
		ps.setString(3, lugaresRotas.getContinente());

		return lugaresRotas;
	}
	
	public Boolean delete(int id) throws SQLException {

		String sql = "delete from lugares_rotas where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}
		
		return false;
	}

}
