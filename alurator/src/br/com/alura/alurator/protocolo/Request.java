package br.com.alura.alurator.protocolo;

import java.util.HashMap;
import java.util.Map;

public class Request {
	
	private String nomeControle;
	private String nomeMetodo;
	private Map<String, Object> queryParams;

	public Request(String url) {
		
		// /nomeControle/nomeMetodo
		/*
		 * Casos possiveis:
		 * /controlador/metodo
		 * /controlador/metodo?param1=valor1&param2=valor2
		 * 
		 * /produto/filtra?nome=produto
		 * /produto/filtra?nome=produto&marca=marca 1
		 * /produto/filtra?marca=marca 1&nome=produto
				 
				 
		 */
		
		String[] partesUrl = url.replaceFirst("/", "")
				.split("[?]");
		
		String[] controleEMetodo = partesUrl[0].split("/");
		

		this.nomeControle =  Character.toUpperCase(controleEMetodo[0].charAt(0)) + 
				controleEMetodo[0].substring(1) + "Controller";
		
		this.nomeMetodo = controleEMetodo[1];
		
		
		queryParams = partesUrl.length>1
					? new QueryParamsBuilder().comParametros(partesUrl[1]).build() 
					: new HashMap<String, Object>();
		 
	}

	public String getNomeControle() {
		// TODO Auto-generated method stub
		return nomeControle;
	}
	
	
	public String getNomeMetodo() {
		return this.nomeMetodo;
	}

	public Map<String, Object> getQueryParams() {
		return queryParams;
	}
	
	
}
