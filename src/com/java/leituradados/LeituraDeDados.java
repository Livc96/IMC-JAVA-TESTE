package com.java.leituradados;
//Exercicio feito em curso

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		
		int idade = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		System.out.println("Digite o peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double IMC = peso / (altura * altura);
		
		sc.close();
		
		System.out.println(IMC);
		
		System.out.println(nome);
		
		if (IMC >= 18.5 && IMC <= 25.0) {
			System.out.println("Peso ideal");}
				
		if (IMC >= 26.0) {
			System.out.println("Fora do peso normal");}
		
		if (idade <= 0) {
			System.out.println("idade inválida");}
		
		if (idade >= 1 && idade <=17) {
			System.out.println("Menor idade");}
		
		if (idade >= 18 && idade < 70) { 	
			System.out.println("Maior Idade");} 
		
		else if (idade >= 70) {
		    System.out.println("Terceira idade");}
		    
		if (idade >= 100) {
			System.out.println("Centenária");}
		
		
	}
	
	
	}



