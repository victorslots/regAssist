import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import func.Func;

import javax.swing.JLabel;
import javax.swing.JTable;

public class init {
	
	private JFrame frmRegistroDeAtividades;
	private JTextField textNome;
	private JLabel lblQtde;

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
		frmRegistroDeAtividades = new JFrame();
		frmRegistroDeAtividades.setTitle("Registro de Atividades");
		frmRegistroDeAtividades.setBounds(100, 100, 450, 300);
		frmRegistroDeAtividades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeAtividades.getContentPane().setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(50, 11, 374, 20);
		frmRegistroDeAtividades.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 14, 46, 14);
		frmRegistroDeAtividades.getContentPane().add(lblNome);
		
		JButton btnCriar = new JButton("Criar Funcionario");
		btnCriar.setBounds(263, 217, 161, 33);
		frmRegistroDeAtividades.getContentPane().add(btnCriar);
		
		lblQtde = new JLabel("QtdeFunc:");
		lblQtde.setBounds(10, 51, 67, 14);
		frmRegistroDeAtividades.getContentPane().add(lblQtde);
		
		
		btnCriar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Func funcionario = new Func(textNome.getText());
				lblQtde.setText("QtdeFunc:" + funcionario.getQtdeFunc());
				
			}
			
		});
	}
}
