package br.com.oca.metodos;
class OverLoader{
	
	public void metodo(double a, int b) {
		System.out.println("com 2 parametros double e int");
	}
	public void metodo(int b, double a) {
		System.out.println("com 2 parametros int e double");
	}
	
	public void metodo(String a, int b) {
		System.out.println("com 2 parametros String e Int");
	}
	public void metodo(int b, String a) {
		System.out.println("com 2 parametros Int e String");
	}
	public void metodo(Object o) {
		System.out.println("com objeto");
	}
	public void metodo(String s) {
		System.out.println("com string");
	}
	public void metodo(int a) {
		System.out.println("com int");
	}
	public void metodo(double b) {
		System.out.println("com double");
	}
	public void metodo() {
		System.out.println("Vazio");
	}
}
public class TestaOverload {
	public static void main(String args[]) {
		
		new OverLoader().metodo(3, 5.2); // chamando com int e double
		new OverLoader().metodo(5.2, 3); // chamando com double e int
		//new OverLoader().metodo(5, 3); // Não funciona porque é necessário ser mais específico
		
		new OverLoader().metodo("Minha String"); // chamando com string
		new OverLoader().metodo((Object) "Objeto"); // passanddo por conversão echamando com objeto
		new OverLoader().metodo(new Object()); // chamando com objeto
		new OverLoader().metodo((short)123); // passanddo por conversão e chamando com int
		new OverLoader().metodo((float)123); // passanddo por conversão e chamando com double
		new OverLoader().metodo(123.3);// chamando o método com double
		new OverLoader().metodo();
	}

}
