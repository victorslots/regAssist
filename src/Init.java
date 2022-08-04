import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import filesMng.FilesMng;
import func.Func;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Init {
	
	private JFrame frmRegistroDeAtividades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Init window = new Init();
					window.frmRegistroDeAtividades.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the application.
	 */
	public Init() {
		initialize();
	}

	/*
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		FilesMng manager = new FilesMng();
		
		frmRegistroDeAtividades = new JFrame();
		frmRegistroDeAtividades.setTitle("Registro de Atividades");
		frmRegistroDeAtividades.setBounds(100, 100, 1040, 600);
		frmRegistroDeAtividades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeAtividades.getContentPane().setLayout(null);
		
		JButton btnCriar = new JButton("Criar Funcionário");
		btnCriar.setBounds(10, 11, 161, 33);
		frmRegistroDeAtividades.getContentPane().add(btnCriar);
		
		JList list = new JList(manager.atualizaFuncionarios());
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 61, 161, 437);
		frmRegistroDeAtividades.getContentPane().add(list);
		
		JButton btnCriarTrabalho = new JButton("Criar Trabalho");
		btnCriarTrabalho.setBounds(10, 517, 161, 33);
		frmRegistroDeAtividades.getContentPane().add(btnCriarTrabalho);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(181, 11, 2, 539);
		frmRegistroDeAtividades.getContentPane().add(separator);
		
		JPanel trabalhos = new JPanel();
		trabalhos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		trabalhos.setBackground(Color.WHITE);
		trabalhos.setBounds(193, 11, 821, 539);
		frmRegistroDeAtividades.getContentPane().add(trabalhos);
		
		
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
		
		btnCriarTrabalho.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Diag criarTrabalho = new Diag();
				criarTrabalho.setVisible(true);
				
				String nome = list.getSelectedValue().toString();
				manager.escreveTrabalho(nome);
			}
		});
	}
}
