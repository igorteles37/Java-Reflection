package br.com.alura.alurator.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorConstrutor {

	private Constructor<?> construtor;

	public ManipuladorConstrutor(Constructor<?> construtor) {
		this.construtor = construtor;
	}

	public Object invoca() {
		try {
			return construtor.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro no Construtor", e.getTargetException());
		}
		
		
	}

}
