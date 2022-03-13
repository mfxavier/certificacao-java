package br.com.oca.metodos;
class Motos {
	// cuidado da ordem da inicialização das variaveis estáticas.
	// não possível colocar o mesmo nome de métodos entre metodos estaticos e não-estaticos, mesmo com herança
	
	/*
	public String aceleracao() {
		return "110Km/h";
	}
	*/
	public static String aceleracao() {
		return "110Km/h";
	}
	
	public static final int MOTOR = 8;
	public static final int ID_MOTOR = MOTOR;
	
	
	public static String obter = aceleracao();
	
	public static int totalDeMotos = 0;
	private static String marca = "V8";
	
	public String getMarca() {
		return Motos.marca;
	}
	
	public String setMarca(String marca) {
		return this.marca = marca;
	}
}

class MotoCycle extends Motos {
	//não é possível colocar o mesmo nome de métodos entre metodos estaticos e não-estaticos, mesmo com herança
	/*
	public String aceleracao() {
		return "110Km/h";
	}
	*/
	// Posso ter nomes duplicados em metodos estáticos
	public static String aceleracao() {
		return "300Km/h";
	}
	
}
public class TestaStatic {
	public static void main(String args[]) {
		
		
		System.out.println(Motos.totalDeMotos);
		System.out.println(Motos.obter);
		
		Motos motos = new Motos();
		motos.setMarca("HONDA");
		System.out.println(motos.getMarca());
		System.out.println(motos.MOTOR);
		System.out.println(motos.ID_MOTOR);
		
		System.out.println(motos.aceleracao());
		
		MotoCycle motoCycle = new MotoCycle();
		System.out.println(motoCycle.aceleracao());
		
		Motos harley = new MotoCycle();
		System.out.println(harley.aceleracao()); // metodos estaticos não sobrescrevem, recebe atraves do tipo que nesse é MOTO 
		
		
	}
}
