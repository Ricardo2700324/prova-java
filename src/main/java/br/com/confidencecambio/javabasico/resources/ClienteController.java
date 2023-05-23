package br.com.confidencecambio.javabasico.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	 @GetMapping("/{nome}")
	    public ClienteDTO getCliente(@PathVariable String nome) {
	        Cliente cliente = new Cliente(nome);
	        return new ClienteDTO(cliente);
	    }

	    public static class ClienteDTO {
	        private String primeiroNome;
	        private String ultimoNome;
	        private String nomeMaiusculo;
	        private String nomeAbreviado;

	        public ClienteDTO(Cliente cliente) {
	            this.primeiroNome = cliente.obterPrimeiroNome();
	            this.ultimoNome = cliente.obterUltimoNome();
	            this.nomeMaiusculo = cliente.obterNomeMaiusculo();
	            this.nomeAbreviado = cliente.obterNomeAbreviado();
	        }

	        
	        public String getPrimeiroNome() {
	            return primeiroNome;
	        }

	        public String getUltimoNome() {
	            return ultimoNome;
	        }

	        public String getNomeMaiusculo() {
	            return nomeMaiusculo;
	        }

	        public String getNomeAbreviado() {
	            return nomeAbreviado;
	        }
	    }
	    
	    //Postman - http://localhost:8080/clientes/João Soares Silva

}
