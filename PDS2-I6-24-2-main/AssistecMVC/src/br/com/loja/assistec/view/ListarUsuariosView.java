package br.com.loja.assistec.view;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.model.UsuarioTableModel;

public class ListarUsuariosView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtLocalizar;
	private JTable tabela;
	private ArrayList<Usuario> usuariosList;
	private ListarUsuariosView listarUsusariosView;
	private UsuarioTableModel usuarioTableModel;
	private TableRowSorter<UsuarioTableModel> rowSorter;
	private JScrollPane scroolPanel;
	private JButton btnCadastrar;
	private JButton btnFechar;
	


	public ListarUsuariosView() {
	inicializarComponentes();
	configurarJanela();
	}
	public void inicializarComponentes(){
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setActionCommand("BotaoCadastrar");
		btnCadastrar.setBounds(300,300,60,60);
		
		btnFechar=new JButton("Fechar");
		btnFechar.setActionCommand("BotaoFechar");
		btnFechar.setBounds(300,300,60,60);
		
		txtLocalizar=new JTextField();
		txtLocalizar.setBounds(139, 12, 252, 20);
	
		tabela = new JTable();
		scroolPanel = new JScrollPane(tabela);
		scroolPanel.setBounds(39,53,539,215);
		
		setLayout(null);
		add(btnCadastrar);
		add(btnFechar);
		add(txtLocalizar);
		add(scroolPanel);
	
	}
	public void configurarJanela() {
		setTitle("Listagem de usuários");
		setBounds(100, 100, 650, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void addListarUsuarioListener(ActionListener listener) {
		btnCadastrar.addActionListener(listener);
		btnFechar.addActionListener(listener);
		
	}
		
}
	
