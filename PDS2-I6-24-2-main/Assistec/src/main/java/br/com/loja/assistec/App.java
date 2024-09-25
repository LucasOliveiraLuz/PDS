package br.com.loja.assistec;

import br.com.loja.assistec.controller.LoginController;
import br.com.loja.assistec.view.LoginView;


public class App {
    public static void main(String[] args) {
    	LoginView view = new LoginView();
		@SuppressWarnings("unused")
		LoginController controller = new LoginController(view);
		view.setVisible(true);
    }
}
