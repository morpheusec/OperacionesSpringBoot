package com.operaciones.basicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OperacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperacionesApplication.class, args);
		System.out.println("suma de dos numeros 2 + 3");
		calculadora suma = new calculadora(new suma());	
		suma.calcularOperacion(2,3);
		System.out.println("Resta de dos numeros 4 - 2");
		calculadora resta = new calculadora(new resta());	
		resta.calcularOperacion(4,2);
		System.out.println("Multiplicacion de dos numeros 4 * 5");
		calculadora multi = new calculadora(new multiplicacion());	
		multi.calcularOperacion(4,5);
		System.out.println("division de dos numeros 10 /2");
		calculadora div = new calculadora(new division());	
		div.calcularOperacion(10,2);
		
	}
		
	
	

	
}
