package exercicios_while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		exercicio3();
	}	
		
	public static void exercicio1() {	
		
		Scanner scanner = new Scanner(System.in);
		
		int senha = scanner.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = scanner.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		scanner.close();
	}

	public static void exercicio2() {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} 
			
			else if (x < 0 && y  > 0) {
				System.out.println("Segundo");
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			
			else {
				System.out.println("Quarto");
			}
			
			x = scanner.nextInt();
			y = scanner.nextInt();
			
		}
		
		scanner.close();
	}
	
	public static void exercicio3() {
		
		Scanner scanner = new Scanner(System.in);
		
		int tipo = scanner.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (tipo != 4) {
		
			if (tipo == 1) {
				alcool = alcool + 1;
				
			} else if (tipo == 2) {
				gasolina = gasolina + 1;	
			
			} else if (tipo == 3) {
				diesel = diesel + 1;
			} 
			
			tipo = scanner.nextInt();	
		
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		
		scanner.close();
	}
}
