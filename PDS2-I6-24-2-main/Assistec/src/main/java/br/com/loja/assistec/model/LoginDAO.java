package br.com.loja.assistec.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO extends GenericDAO {

	public Boolean bancoOnline() throws SQLException {
		
		return getConnection().isValid(0);
	}
	
	//metodo para autenticar usuario
	
	public Usuario autenticar(String login, String senha) throws SQLException {
		String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
		Usuario usuario = null;
		PreparedStatement pstm = getConnection().prepareStatement(sql);
		pstm.setString(1, login);
		pstm.setString(2, senha);
		ResultSet rs = pstm.executeQuery();
		
		while(rs.next()) {
			usuario = new Usuario();
			usuario.setIduser(rs.getInt("iduser"));
			usuario.setNome(rs.getString("nome"));
			usuario.setFone(rs.getString("fone"));
			usuario.setLogin(rs.getString("login"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setPerfil(rs.getString("perfil"));
		}
		rs.close();
		pstm.close();
		getConnection().close();
		
		return usuario;
				
	}
}
