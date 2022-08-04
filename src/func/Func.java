package func;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Trab.Trab;
import filesMng.FilesMng;

/*
 *Classe responsavel pela definição de objetos 'funcionário' 
 */
public class Func {
	static int qtdeDeFuncionarios = FilesMng.getNumerodeArquivos();
	private String nome = new String();
	ArrayList<Trab> trabalhos = new ArrayList<Trab>();
	

	public Func(String nome) {
		this.nome = nome;
		qtdeDeFuncionarios++;
	}

	public static int getQtdeDeFuncuncionarios() {
		return qtdeDeFuncionarios; 
	}
	
}