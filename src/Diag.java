import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Dialog.ModalityType;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;

public class Diag extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fieldID;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public Diag() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.DOCUMENT_MODAL);
		setModal(true);
		setTitle("Criar Trabalho");
		setBounds(100, 100, 450, 265);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		fieldID = new JTextField();
		fieldID.setEnabled(false);
		fieldID.setBounds(66, 11, 358, 20);
		contentPanel.add(fieldID);
		fieldID.setColumns(10);

		JLabel lblID = new JLabel("ID:");
		lblID.setBounds(10, 14, 21, 14);
		contentPanel.add(lblID);

		textField = new JTextField();
		textField.setBounds(66, 42, 358, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 45, 46, 14);
		contentPanel.add(lblCliente);

		textField_1 = new JTextField();
		textField_1.setBounds(66, 73, 358, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setBounds(10, 76, 57, 14);
		contentPanel.add(lblDescricao);
		
		JComboBox comboBoxDia = new JComboBox();
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDia.setBounds(66, 117, 50, 22);
		contentPanel.add(comboBoxDia);
		
		JLabel lblEntrega = new JLabel("Entrega:");
		lblEntrega.setBounds(10, 121, 46, 14);
		contentPanel.add(lblEntrega);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"}));
		comboBox.setBounds(126, 117, 90, 22);
		contentPanel.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(226, 118, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
