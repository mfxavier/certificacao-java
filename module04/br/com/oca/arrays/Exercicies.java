package br.com.oca.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicies {
	
	public static void main(String args[]) {
		
	}
	
	static void exercicio09(){
		System.out.print("==========================");
        ArrayList<String> ss = new ArrayList<String>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");

        for(String s:ss){
            if(s.equals("c")) s = "b";
            else if(s.equals("b")) s= "c";
        }
        for(String s:ss) System.out.println(s);
        
        System.out.print("Resposta = exercicio09");
        
        /*
        Não compila, s é final por padrão.

        Alternativa incorreta
        Compila e imprime a, c, d, b.

        Alternativa incorreta
        Compila e imprime a, c, b, d.

        Alternativa incorreta
        Compila e imprime a, b, c, d.

        Alternativa incorreta
        Compila e imprime a, c, c, d.
        */
        
    }
	 static void exercicio08(){
		 System.out.print("==========================");
		ArrayList<String> a = new ArrayList<String>();
	    a.add(0,"a");
	    a.add(1,"b");
	    
	    for(Iterator<String> i=a.iterator();i.hasNext();i.next()) {
	        String element = i.next();
	        System.out.println(element);
	    }
	    System.out.print("Resposta = exercicio08");
	    /*
		    Não compila.
	
			Alternativa incorreta
			Compila e imprime a e b.
			
			Alternativa incorreta
			Compila e imprime b.
			
			Alternativa incorreta
			Compila e imprime a.
			
			Alternativa incorreta
			Compila e imprime b e a.
		
	     * */
		 
	 }
	 static void exercicio06() {
		 System.out.print("=========================="); 
		ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        b.add("a");c.add("c");
        b.add("b");c.add("d");
        a.addAll(b);
        a.addAll(c);
        System.out.println(a.get(0));
        System.out.println(a.get(3));
        
        System.out.print("Resposta = exercicio06");
        
       /* 
        Compila e não sabemos a ordem em que os elementos serão impressos.

        Alternativa correta
        Não compila

        Alternativa correta
        Compila e imprime c e b.

        Alternativa correta
        Compila e imprime a e d.
        
        */
	 }
}


/* gabarito 
 * questão 9
 * O código compila e imprime a, b, c, d, pois o laço está alterando o
 *  valor referenciado pela variável s, e não o valor 
 *  contido dentro da nossa ArrayList.
 *  
 *  ======================
 *  questão 8
 *  
 *  O código compila e imprime somente a. Isso porque ele executa um next durante o 
 *  passo de iteração do laço for, o que acaba consumindo o segundo elemento sem imprimi-lo.
 *  Não foi desta vez! Tente novamente
 *  
 *  ======================
 *  questão 6
 *  
 *  O código inclui os elementos sempre no final da ArrayList, portanto imprime a e depois d.
 * */


