package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import br.com.alura.alurator.playground.controle.Controle;
import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException {
		// TODO Auto-generated method stub
		
		//url -> /controle/lista
		Class<SubControle> subControleClasse1 = SubControle.class;
		
		
		
		
		Class<?> subControleClasse2 = Class.forName("br.com.alura.alurator.playground.controle.SubControle");
		
		Class<?> ControleClasse1 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		
		
		Constructor<SubControle> construtorSubControle = subControleClasse1.getDeclaredConstructor();
		
		//Constructor<SubControle> construtorSubControleComParametro = subControleClasse1.getDeclaredConstructor(String.class);
		
		
		//System.out.println(construtorSubControle);
		//System.out.println(construtorSubControleComParametro);
		
	/*construtorSubControle.setAccessible(true);
		Object subControle = construtorSubControle.newInstance();
		
		System.out.println(subControle);*/
		
		
		//ControleClasse1.newInstance();
		
		try {
			Object contrutorConctrole = ControleClasse1.getDeclaredConstructor().newInstance();
		} catch (InvocationTargetException e	) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		

	}

}
