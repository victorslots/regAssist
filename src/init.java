import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListModel;

import filesMng.FilesMng;
import func.Func;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class init {
	
	private JFrame frmRegistroDeAtividades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					init window = new init();
					window.frmRegistroDeAtividades.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public init() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FilesMng manager = new FilesMng();
		
		frmRegistroDeAtividades = new JFrame();
		frmRegistroDeAtividades.setTitle("Registro de Atividades");
		frmRegistroDeAtividades.setBounds(100, 100, 800, 600);
		frmRegistroDeAtividades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeAtividades.getContentPane().setLayout(null);
		
		JButton btnCriar = new JButton("Criar Funcionário");
		btnCriar.setBounds(10, 11, 161, 33);
		frmRegistroDeAtividades.getContentPane().add(btnCriar);
		
		JList list = new JList(manager.atualizaFuncionarios());
		list.setBounds(10, 61, 161, 467);
		frmRegistroDeAtividades.getContentPane().add(list);
		
		JButton btnAtualizarFuncionarios = new JButton("Atualizar Funcionários");
		btnAtualizarFuncionarios.setBounds(190, 11, 161, 33);
		frmRegistroDeAtividades.getContentPane().add(btnAtualizarFuncionarios);
		
		
		btnCriar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nome = JOptionPane.showInputDialog("Entre com o nome do Funcionário:");
				Func funcionario = new Func(nome);
				manager.criarFuncionário(nome);
				list.setModel(manager.atualizaFuncionarios());
			}
			
		});
		
		btnAtualizarFuncionarios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				list.setModel(manager.atualizaFuncionarios());
			}
		});
	}
}
