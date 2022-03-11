package br.com.oca.loops;
/*
 * cuidados do while
 * 
 * 1- executa primeira a condição e depois o código
 * 2- pode entrar em loop infinito
 * 3- as chaves são opcionais
 * 
 * */
public class TestaWhile {
	public static void main(String args[]) {
		aula01();
	}
	static void aula01() {
		int i  = 1;
		while(i<10) { // primeiro verifica a condição
			System.out.println(i);
			i++;
		}
		
		/*
		int x=1;
		while(x<10)
			System.out.println(x);
			x++; erro aqui  !!!
		*/
		
		/*
		int y = 1;
		final boolean verdadeiro = true;
		while(true) criar loop infinito!!!!
			System.out.println(y);
		*/
		/*
		int y = 1;
		while(false) nunca será atendido !!!
			System.out.println(y);
		*/
	}
}
