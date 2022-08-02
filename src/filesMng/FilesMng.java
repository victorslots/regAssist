package filesMng;

import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;

public class FilesMng {
	
	File arquivo;
	String caminhoFuncionarios = "src/funcs/";
	File pasta = new File(caminhoFuncionarios);
	
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
}
