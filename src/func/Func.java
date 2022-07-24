package func;

import java.io.File;
import java.io.IOException;

public class Func {
	static int QtdeFunc;
	private String nome;
	private String caminho = "src/funcs/";
	private File pasta = new File(caminho);

	public Func(String nome) {
		this.nome = nome;
		

		
		File arquivo = new File(caminho.concat(nome.toUpperCase()));
		

		try {
			if (!arquivo.exists()) {
				arquivo.createNewFile();
				QtdeFunc = pasta.listFiles().length;
			} else {
				System.out.println("Funcionario já existe!");
			}
		} catch (IOException e) {

		}
		
	}
	public File[] getFuncs() {
		return pasta.listFiles();
	}
	public int getQtdeFunc() {
		return QtdeFunc;
	}
}