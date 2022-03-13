package br.com.oca.loops;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestaFor {
	public static void main(String args[]) {
		aula02ArrayList();
		
	}
	static void aula02() {
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		
		int[] inteiros = {1,2,3,4,5};
		for(int i = 0; i < inteiros.length;i++) {
			int numero = inteiros[i];
			System.out.println(numero);
		}
		// forEach - faz a mesma coisa do código acima
		for(int numero : inteiros) {
			System.out.println(numero);
		}
	}
	static void aula02ArrayList() {
		ArrayList<String> pets = new ArrayList<String>();
		pets.add("cookie");
		pets.add("margareth");
		pets.add("luke");
		pets.add("tom");
		
		for(String pet : pets) {
			System.out.println(pet);
		}
		
	}
}
