package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.ConnectionMySQL;
import Model.Pacote;

public class PacoteDAO {
	
	private Connection conn;

	public PacoteDAO() throws Exception {
		this.conn = ConnectionMySQL.createConnectionMySQL();
	}

	public Pacote create(Pacote pacote) throws SQLException {

		String sql = "insert into pacote(duracao, dataSaida, hospedagem, comodidade, roteiro, refeicoes, valor, documentacao, guia, programaDiario)values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, pacote.getDuracao());
		ps.setString(2, pacote.getDataSaida());
		ps.setString(3, pacote.getHospedagem());
		ps.setString(4, pacote.getComodidade());
		ps.setString(5, pacote.getRoteiro());
		ps.setString(6, pacote.getRefeicoes());
		ps.setDouble(7, pacote.getValor());
		ps.setString(8, pacote.getDocumentacao());
		ps.setString(9, pacote.getGuia());
		ps.setString(10, pacote.getProgramaDiario());

		ps.execute();
		ps.close();

		return pacote;
	}

	public Pacote get(int id) throws SQLException {

		String sql = "select * from pacote where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			Pacote pacote = new Pacote(result.getInt(2), result.getString(3), result.getString(4), result.getString(5),
					result.getString(6), result.getString(7), result.getDouble(8), result.getString(9),
					result.getString(10), result.getString(11));

			pacote.setId(result.getInt(1));
			
			return pacote;
		}
		return null;
	}

	public Pacote update (Pacote pacote) throws SQLException{
		String sql = "update rotas set duracao = ? dataSaida = ?, hospedagem = ?, comodidade = ?, roteiro = ?, refeicoes = ?, valor = ?, documentacao = ?, guia = ?, programaDiario = ? where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
	
		ps.setInt(1, pacote.getDuracao());
		ps.setString(2, pacote.getDataSaida());
		ps.setString(3, pacote.getHospedagem());
		ps.setString(4, pacote.getComodidade());
		ps.setString(5, pacote.getRoteiro());
		ps.setString(6, pacote.getRefeicoes());
		ps.setDouble(7, pacote.getValor());
		ps.setString(8, pacote.getDocumentacao());
		ps.setString(9, pacote.getGuia());
		ps.setString(10, pacote.getProgramaDiario());
		ps.setInt(9, pacote.getId());

		ps.execute();
		ps.close();

		return pacote;	
	}
	
	public Boolean delete(int id) throws SQLException {

		String sql = "delete from pacote where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}

		return false;
	}

}
