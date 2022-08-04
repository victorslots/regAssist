package Trab;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Trab {
	/*
	 * Classe responsavel por representar um trabalho;
	 */
	
	static int ID;
	String descricao;
	String cliente;
	double valor;
	boolean pronto = false;
	static DecimalFormat fd = new DecimalFormat("#,##0.00");
	
	Calendar data = Calendar.getInstance();
}