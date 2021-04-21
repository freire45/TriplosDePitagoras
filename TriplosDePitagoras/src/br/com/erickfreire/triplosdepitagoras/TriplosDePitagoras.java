package br.com.erickfreire.triplosdepitagoras;

import java.util.Scanner;

/**
 * Programa em Java que verifica se valores forma um triagulo retangulo
 * @author Erick Freire
 * @version 1 - Criado em 21-04-2021 as 16:58
 */

public class TriplosDePitagoras {
	public static void main(String[] args) {
		int lado1;
		int lado2;
		int lado3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se valores formam um triângulo Retangulo: ");
		
		System.out.print("Informe o valor do primeiro lado: ");
		lado1 = entrada.nextInt();
		
		System.out.print("Informe o valor do segundo lado: ");
		lado2 = entrada.nextInt();
		
		System.out.print("Informe o valor da hipotenusa: ");
		lado3 = entrada.nextInt();
		
		if(Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)) {
			System.out.println("É um quadrado Retangulo");
			
		} else {
			System.out.println("Não é um quadrado Retangulo: ");
		}
		
	}

}
