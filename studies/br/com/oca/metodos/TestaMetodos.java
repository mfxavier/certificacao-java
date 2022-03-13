package br.com.oca.metodos;

class Param {
	
	
	String retonaVerdadeiroOuFalsoComException(int a) {
		if(true) return "Sou verdadeiro";
		throw new RuntimeException("Sou uma exceção"); 
	}
	
	String retonaVerdadeiroOuFalso(int a) {
		if(true) return "Sou verdadeiro";
		return "Sou falso";
	}
	
	int getNumero() {
		return 10;
	}
	
	void primitivo(double a) {
		return;
	}
	void referencia(Object obj) {
		
	}
	void teste(int a, int b) {
		
	}
}
class ClasseMetodos{
	
	int getNumero() {
		return 5;
	}
}

public class TestaMetodos {
	public static void main(String[] args) {
		Param p = new Param();
		p.teste(1, 2);
		p.referencia(new Object());
		p.primitivo(1d);
		System.out.println(p.retonaVerdadeiroOuFalso(0));
		System.out.println(p.retonaVerdadeiroOuFalsoComException(0));
	}
}
