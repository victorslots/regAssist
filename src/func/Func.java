package func;

import java.io.File;
import java.io.IOException;

/*Classe responsavel pela definição de objetos 'funcionário'"
 * 
 */
public class Func {
	static int qtdeDeFuncionarios;
	private String nome = new String();

	public Func(String nome) {
		this.nome = nome;
		qtdeDeFuncionarios++;
	}

	public int getQtdeDeFuncuncionarios() {
		return qtdeDeFuncionarios;
	}
}