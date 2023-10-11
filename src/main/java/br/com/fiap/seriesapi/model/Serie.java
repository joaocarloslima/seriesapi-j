package br.com.fiap.seriesapi.model;

public record Serie(
	
	Long id,
	String titulo,
	String sinopse,
	String poster,
	boolean assistido,
	double nota
		
){}
