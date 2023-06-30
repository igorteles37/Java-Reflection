package br.com.alura.alurator.playground.reflexao;

import java.io.IOException;
import java.util.List;

import br.com.alura.alurator.playground.controle.Controle;
import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjeto {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		
		//url -> /controle/lista
		Class<Controle> controleClasse1 = Controle.class;
		
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 = controle.getClass();
		
		Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		
		Controle objetoControleClass1 = controleClasse1.newInstance();
		List<String> lista = objetoControleClass1.getLista();
		
		Controle objetoControleClass3 = (Controle) controleClasse3.newInstance();
		
		System.out.println(objetoControleClass1 instanceof Controle);
		
		
	}

}
