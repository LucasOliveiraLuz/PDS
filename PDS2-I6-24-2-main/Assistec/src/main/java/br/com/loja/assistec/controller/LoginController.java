package br.com.loja.assistec.controller;

import br.com.loja.assistec.model.UsuarioModel;
import br.com.loja.assistec.view.LoginView;

public class LoginController {

	private LoginView view;
	private UsuarioModel model;
	
	public LoginController(LoginView view) {
		this.view = view;
		this.model = new UsuarioModel();
		
		if(model.conexao != null) {
			view.lblStaus.setText("conectado ao Banco de dados");
			System.out.println("Conectado no Banco");
			
		}else {
			System.out.println("Não conectado");
			view.lblStaus.setText("Não conectado ao Banco de dados");
		}
	}
	
	
}
