package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesteInvocaMetodoSemParametro {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> controleClasse = 
				Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		
		Constructor<?> construtorPadrao = controleClasse.getDeclaredConstructor();
		
		
		Object controle =construtorPadrao.newInstance(); 
		
		
		Method m = controleClasse.getDeclaredMethod("metodoControle2", String.class);
		
		
		
		Object retorno = m.invoke(controle, "abc");
		
		
		
		System.out.println(retorno);
		
	}

}
