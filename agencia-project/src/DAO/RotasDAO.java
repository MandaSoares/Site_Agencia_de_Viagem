package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cliente;
import modelo.Pacote;
import modelo.Rotas;

public class RotasDAO {
	
private Connection conn; 
	
	public RotasDAO () throws Exception 
	{
		this.conn = ConnectionMYSQL.createConnectionMySQL();
	}
	
	public Rotas create (Rotas rotas) throws SQLException {
		
		String sql = "insert into rotas(duracao, programa, hospedagem, roteiro, valor, destaqueRotas, rotasComGuia, rotasSelfDrive)values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = this.conn.prepareStatement(sql);
		
		ps.setInt(1, rotas.getDuracao());
		ps.setString(2, rotas.getPrograma());
		ps.setString(3, rotas.getHospedagem());
		ps.setString(4, rotas.getRoteiro());
		ps.setDouble(5, rotas.getValor());
		ps.setString(6, rotas.getDestaqueRotas());
		ps.setString(7, rotas.getRotasComGuia());
		ps.setString(8, rotas.getRotasSelfDrive());
		
		ps.execute();
		ps.close();
		
		
		return rotas;
		
	}

	public Rotas get(int id) throws SQLException {

		String sql = "select * from rotas where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet result = ps.executeQuery();

		if (result.next()) {
			Rotas rotas = new Rotas(result.getInt(2), result.getString(2), result.getString(3), result.getString(4),
					result.getDouble(5), result.getString(6),result.getString(7), result.getString(8));

			rotas.setId(result.getInt(1));
			return rotas;
		}
		return null;
	}

	public Rotas update (Rotas rotas) throws SQLException{
		String sql = "update rotas set duracao = ? programa = ?, hospedagem = ?, roteiro = ?, valor = ?, destaqueRotas = ?, rotasComGuia = ?, rotasSelfDrive = ? where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);
	
		ps.setInt(1, rotas.getDuracao());
		ps.setString(2, rotas.getPrograma());
		ps.setString(3, rotas.getHospedagem());
		ps.setString(4, rotas.getRoteiro());
		ps.setDouble(5, rotas.getValor());
		ps.setString(6, rotas.getDestaqueRotas());
		ps.setString(7, rotas.getRotasComGuia());
		ps.setString(8, rotas.getRotasSelfDrive());
		ps.setInt(9, rotas.getId());

		ps.execute();
		ps.close();

		return rotas;	
	}
	
	public Boolean delete(int id) throws SQLException {

		String sql = "delete from rotas where id = ?";
		PreparedStatement ps = this.conn.prepareStatement(sql);

		ps.setInt(1, id);

		if (ps.execute()) {
			return true;
		}

		return false;
	}

}
