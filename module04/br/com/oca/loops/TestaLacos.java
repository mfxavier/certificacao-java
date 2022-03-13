package br.com.oca.loops;

public class TestaLacos {
	
	public static void main(String[] args) {
		usandoSwitchComLabels();
	}
	
	static void usandoSwitchComLabels() {
		for(int i = 1; i < 10; i++) {
			System.out.println("ANTES do switch");
			switch(i) {
			case 0:
			case 1:
				System.out.println("caso "+i); 
				break;
			case 2:
				System.out.println("caso com continue : "+i);
				continue;
			case 3:
				System.out.println("caso "+i);
				break;
			default:
				System.out.println("fora do padrão do caso");
				break;
				
			}
			System.out.println("depois do switch");
		}
		
	}
	
	
	static void usandoLacosNomeadosRepetidos() {
		
		int externo = 1;// é possível colocar o nome de uma variavel com um label
		
		// é possível desde que não estejam dentro do mesmo escopo.
		externo:for(int i = 1; i < 10; i++) {
			for(int j = 1;j < 10; j++) {
				tabuada: System.out.println("Tabuada "+i); // é possível usar LABEL tambem dessa forma.
				
				if(i * j == 25)break externo; // dessa forma iria dar uma break no laço nomeado EXTERNO
					System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		externo:for(int i = 1; i < 10; i++) {
			for(int j = 1;j < 10; j++) {
				if(i * j == 25)break externo; // dessa forma iria dar uma break no laço nomeado EXTERNO
					System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
	
	static void usandoBreakComLacoNomeado() {
		externo:for(int i = 1; i < 10; i++) {
			for(int j = 1;j < 10; j++) {
				if(i * j == 25)break externo; // dessa forma iria dar uma break no laço nomeado EXTERNO
					System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
	static void tabuada() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1;j < 10; j++) {
				if(i * j == 25)break; // quebrou o laço mais proximo que seria do J
					System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
	
	
	static void testeBreakContinue() {
		System.out.println("Inicio do Teste(1)");
		int i=0;
		while(i<10) {
			i++;
			if(i==5) break; // termina o loop quando chegar nessa condição
			System.out.println("i => "+i);
		}
		System.out.println("Fim do Teste");
		
		System.out.println("Inicio do Teste(2)");
		int j=0;
		while(j<10) {
			j++;
			if(j==5) continue; // Não executa essa condição quando verdadeiro porém não imterrompe o looe
			System.out.println("j => "+j);
		}
		System.out.println("Fim do Teste(2)");
	
		
		System.out.println("Inicio do Teste(3)");
		
		for(int x = 0; x < 10; x++) {
			if(x == 8) break;
			if(x==5) continue;// imprime e incrementa
			System.out.println("x=>"+x);
			
		}
		
		System.out.println("Fim do Teste(3)");
		
		

		
		
	}
	
	static void teste2() {
		int[] array1 =  new int[10];
		int[] array2 =  new int[10];
		
		// com for podemos manipular os valores
		int i;
		for (i = 0; i < array1.length; i++ ) {
			array1[i] = i;
			array2[i] = array1[i];
			
			System.out.println("Array1 recebe "+array1[i]);
			System.out.println("Array2 recebe "+array2[i]);
			
			System.out.println("----");
			
		}
		// enhanced for - não é possível manipular os valores, é necessário fazer isso antes.
		for (int meuArray : array1) {
			System.out.println(""+meuArray);
		}
		
		
		
	}
	
	static void teste1() {
		// usado para testar antes de executar
		int i = 1;
		while(i < 2) {
			System.out.println("while"+i);
			i++;
		}
		
		// usado para executar primeiro
		do {
			System.out.println("do/while"+i);
			i++;
		}while(i < 1);
	}

}
