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
		aula03_1();
	}
	static void aula03() {
		
		int i = 1;
		// 1º exemplo, onde verifica a condição e  depois executa.  
		while(i<10) {
			System.out.println(i);
			i++;
		}
		// 2º exemplo, onde executa primeiro e depois  verifica a condição.
		int j = 11;
		
		do {
			System.out.println(j);
			j++;
		} while(j < 10);
		
		
	}
	
	static void aula03_1() {
		// Mesmo exemplo sem chaves
		int i = 1;
		// 1º exemplo, onde verifica a condição e  depois executa.  
		while(i<10) 
			System.out.println(i++);
			System.out.println("NAO APRESENTA ERRO ");// Não apresenta erro porém só executa uma vez
		
		// 2º exemplo, onde executa primeiro e depois  verifica a condição.
		int j = 11;
		do 
			System.out.println(j++); 
			//System.out.println("Erro"); // Apresenta erro nesse caso
		 while(j < 10);
		
		
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
