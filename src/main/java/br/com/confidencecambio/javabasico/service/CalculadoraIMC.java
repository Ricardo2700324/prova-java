package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraIMC {

	public static double calcular(double peso, double altura) {
        //Fórmula: IMC = peso / (altura * altura)
        return peso / (altura * altura);
    }
}
