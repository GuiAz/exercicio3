package br.com.impacta.cafeteria;

import java.util.Scanner;

public class Cafeteria {
	
	public enum CoffeeSize{
		SMALL(2.50), 
		MEDIUM(3.50), 
		LARGE(4.50);
		
		private double preco;
		
		CoffeeSize(double preco){
			this.preco = preco;
		}
		
		public double getPreco() {
			return preco;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner tamanhoCafe = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do Café desejado?");
		System.out.println("SMALL, MEDIUM, LARGE;");
		
		String escolhaTamanhoCafe = tamanhoCafe.nextLine().toUpperCase();
		
		CoffeeSize size;
		try {
			size = CoffeeSize.valueOf(escolhaTamanhoCafe);
			
		} catch(IllegalArgumentException e) {
			System.out.println("Tamanho Inválido");
			return;
	}
		System.out.printf("O preço do café %s é: $%.2f%n", size.name(), size.getPreco());
		tamanhoCafe.close();
	}
}
