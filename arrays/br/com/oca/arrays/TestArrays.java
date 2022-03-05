package br.com.oca.arrays;
import java.util.ArrayList;
import java.util.Iterator;
public class TestArrays {
	public static void main (String args[]){
		System.out.println("Teste-Arrays");
		//testarArrayList();
		testarColections();
	}
	static void testarArrayList(){	
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("java");
		nomes.add("react");
		nomes.add("sql");
		nomes.add("java"); // permite incluir duplicatas
		
		System.out.println(nomes.contains("java")); // Retorna true porque encontrou a sentença
		System.out.println(nomes.contains("XPTO")); // Retorna false porque não encontrou a sentença
		
		boolean removido = nomes.remove("java");
		
		System.out.println(removido); // Retorna true se foi removido nesse caso removeu a 1ª ocorrência somente
		System.out.println(nomes.contains("java")); // Retorna false porque não encontrou a sentença
		
		System.out.println(nomes.size()); // mostra o tamanho do arrays
		
		Object[] objetos = nomes.toArray();// devolve um arrays de objects
		
		String[] nomesArray = nomes.toArray(new String[nomes.size()]);// devolve um arrays de strings
	    String[] nomesArray2 = nomes.toArray(new String[0]);
		/* devolve um arrays de string com o tamanho 0(zero) 
		vai criar outro arrays do 
		mesmo tipo e tamanho quando necessário.
		*/
		
		ArrayList<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("Coreia");
		
		ArrayList<String> tudo = new ArrayList<>();
		tudo.addAll(nomes); // adiciona todos os elementos de uma unica vez
		tudo.addAll(paises);
		
		System.out.println(tudo.size()); // mostra o tamanho do arrays
		
		System.out.println(nomes.get(0)); // pega o conteudo no array na posição zero.
		nomes.add(0,"PHP"); // Adiciona o conteudo no array na posição zero.
		System.out.println(nomes.get(0)); // pega o conteudo no array na posição zero.
		System.out.println(nomes.get(1)); // ao incluir o conteudo anterior é rediewcionado pra frente no array
		
		nomes.remove(0);// removeu na posição zero e fez a sobreposição
		System.out.println(nomes.get(0));
		
		nomes.set(0,"VUE"); // troca valores na posição zero
		System.out.println(nomes.get(0)); // antes era o react agora é o vue
		System.out.println(nomes.get(1)); // na posição 1 agora está o "SQL"
		System.out.println(nomes.indexOf("java")); // 1ª posição encontrada do elemento
		System.out.println(nomes.lastIndexOf("java")); // a última posição encontrada do elemento
		
		System.out.println(nomes.lastIndexOf("nao-existe")); // retorna -1 quando não existe elemento
		
		
	}
	
	static void testarColections(){	
	
		ArrayList<String> cores = new ArrayList<>();
		cores.add("blue");
		cores.add("red");
		cores.add("yellow");
	
		Iterator<String> it = cores.iterator(); // é um objeto que sabe percorrer os elementos de uma coleção, que é uma lista padronizada.
		
		while(it.hasNext()){ // percorrer a coleção atraves da verificação do proximo elemento
			String atual = it.next(); // obtem a posição atual do registro
			System.out.println(atual);
			//it.remove(); // remove o elementoatual da coleção
		}
		
		System.out.println(cores.size()); //retorna o tamanho da coleção
		
		for(String cor : cores){ // outro exemplo para percorrer uma coleção.
			System.out.println(cor);
		}
		
		
	}	
	
}