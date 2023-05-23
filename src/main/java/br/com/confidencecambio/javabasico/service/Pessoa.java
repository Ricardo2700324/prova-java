package br.com.confidencecambio.javabasico.service;

import java.util.Arrays;

public class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome.trim(); // Remove espaços extras no início e no fim

		if (this.nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}
	}

	public String obterPrimeiroNome() {
		return nome.split(" ")[0];
	}

	public String obterUltimoNome() {
		String[] nomes = nome.split(" ");
		return String.join(" ", Arrays.copyOfRange(nomes, 1, nomes.length));
	}

	public String obterNomeMaiusculo() {
		return nome.toUpperCase();
	}

	public String obterNomeAbreviado() {
		String[] nomes = nome.split(" ");
		StringBuilder nomeAbreviado = new StringBuilder(nomes[0]);

		for (int i = 1; i < nomes.length; i++) {
			nomeAbreviado.append(" ").append(nomes[i].charAt(0)).append(".");
		}

		return nomeAbreviado.toString();
	}
}
