package filesMng;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FilesMng {
	
	File arquivo;
	static String caminhoFuncionarios = "src/funcs/";
	static File pasta = new File(caminhoFuncionarios);
	FileWriter fw = null;
	FileReader fr = null;
	static int quantidadeDeArquivos = pasta.listFiles().length;
	
	public void criarFuncionário(String nome) {
		
		 /*TO DO
		 * Verificar alguma validação para ver se o campo do JPane está vazio;
		 *
		 * 
		 */


		try {
			if (nome != null && nome != "") {
				arquivo = new File(caminhoFuncionarios.concat(nome.toUpperCase()));
				if (!arquivo.exists()) {
					arquivo.createNewFile();
				} else {
					System.out.println("Funcionario já existe!");
				}
			}
		} catch (IOException e) {

		}
	}

	public DefaultListModel<String> atualizaFuncionarios() {
		File arquivos[] = pasta.listFiles();
		DefaultListModel<String> model = new DefaultListModel<>();
		
		for(int i = 0; i<arquivos.length;i++) {
			model.add(i, arquivos[i].getName());
		} 
		
		return model;
		
	}
	
	public static int getNumerodeArquivos() {
		return quantidadeDeArquivos;
	}
	
	public void escreveTrabalho(String nome) {
		try {
		fw = new FileWriter(caminhoFuncionarios.concat(nome),true);
		fw.append("#TRABALHO\n");
		fw.append("Descrição:\n");
		fw.append("Data de Entrega:\n");
		fw.append("Valor:\n");
		fw.flush();
		fw.close();
		
		}catch(IOException e) {
			JOptionPane.showInternalMessageDialog(null, "Arquivo Não Encontrado");
		}
	}
}
