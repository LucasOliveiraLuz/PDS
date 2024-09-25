package br.com.loja.assistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LoginView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField txtUsuario;
	public JPasswordField txtSenha;
	public JLabel lblStaus;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUsuario = new JLabel("Usuario");
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		
		JButton btnLogin = new JButton("Login");
		
		txtSenha = new JPasswordField();
		
		lblStaus = new JLabel("");
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUsuario)
								.addComponent(lblSenha))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtSenha)
								.addComponent(txtUsuario)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(144)
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addComponent(lblStaus)))
					.addContainerGap(192, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addComponent(btnLogin)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblStaus)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
