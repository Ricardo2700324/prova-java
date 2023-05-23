package br.com.confidencecambio.javabasico.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.CalculadoraIMC;

@RestController
public class IMCResource {
	
	@GetMapping("/imc")
    public String calcularIMC(@RequestParam("peso") double peso, @RequestParam("altura") double altura) {
        double imc = CalculadoraIMC.calcular(peso, altura);
        return "Seu IMC é: " + imc;
    }
	
	//Postman - http://localhost:8080/imc?peso=75&&altura=1.75


}
