package br.com.senac.matrixfilmes.modelos;

public class Filme {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double SomaDasAvaliacoes;
	priavte int totalDasAvaliacoes;
	private int duracaoEmMinutos;

	private int getTotalDeAvaliacoes() {
	return totalDeAvaliacoes;
	}

	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public void exibeFichaTecnica() {

	