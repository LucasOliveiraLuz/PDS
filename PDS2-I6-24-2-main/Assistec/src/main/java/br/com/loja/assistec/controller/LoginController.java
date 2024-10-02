package br.com.loja.assistec.controller;

import java.sql.SQLException;

import br.com.loja.assistec.model.LoginDAO;

public class LoginController {

	
	public LoginController() {
		
		
	}
	public Boolean verificarBancoOnline() throws SQLException {
		
		LoginDAO dao = new LoginDAO();
		return dao.bancoOnline();
		
	}
	
}
