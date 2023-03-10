package exercicio_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		exercicio8();
		
     }
	
	public static void exercicio1() {
		
		Scanner xx = new Scanner(System.in);
		
		int x = xx.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
			
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		xx.close();
		
	}
	
	
	public static void exercicio2() {
		
		Scanner xx = new Scanner(System.in);
		
		int x = xx.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		
		} else { 
			System.out.println("IMPAR");
		}
		
		xx.close();
		
		
	}
	
	
	public static void exercicio3() {
		
		Scanner xx = new Scanner(System.in);
		
		int x = xx.nextInt();
		int x2 = xx.nextInt();
		
		if (x % x2 == 0 || x2 % x == 0) {
			System.out.println("São Múltiplos");
			
		} else {
			System.out.println("Não são Múltiplos");
			
		}
			
		xx.close();
	}
	
	public static void exercicio4() {
		
		Scanner xx = new Scanner(System.in);
	
		int x = xx.nextInt();
		int x2 = xx.nextInt();
	
		if (x == x2) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
			
		} else if (x2 < x) {
			int x3 = 24 - x;
			int x4 = x2 + x3;
			
			System.out.println("O JOGO DUROU " + x4 + " HORA(S)");
			
		} else {
			int x5 = x2 - x;
			
			System.out.println("O JOGO DUROU " + x5 + " HORA(S)");
		}
		
		xx.close();
	}
	
	public static void exercicio5() {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o código?");
		int codigo = scanner.nextInt();
		
		System.out.println("Qual é a quantidade?");
		int quantidade = scanner.nextInt();
		
		if (codigo == 1) {
			double preco = quantidade * 4;
			System.out.printf("Preço = R$ %.2f%n", preco);
			
		} else if (codigo == 2) {
			double preco = quantidade * 4.50;
			System.out.printf("Preço = R$ %.2f%n", preco);
			
		} else if (codigo == 3) {
			double preco = quantidade * 5;
			System.out.printf("Preço = R$ %.2f%n", preco);
			
			
		} else if (codigo == 4) {
			double preco = quantidade * 2;
			System.out.printf("Preço = R$ %.2f%n", preco);	
		
		} else if (codigo == 5) {
			double preco = quantidade * 1.50;
			System.out.printf("Preço = R$ %.2f%n", preco);
		}
		
		scanner.close();
	}
	
	public static void exercicio6() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o valor?");
		double valor = scanner.nextDouble();
		
		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo ([0, 25]");
			
		} else if (valor > 25 && valor <= 50) {
			System.out.println("Intervalo (25, 50]");
				
		} else if (valor > 50 && valor <= 75) {
			System.out.println("Intervalo (50, 75]");
		
		} else if (valor > 75 && valor <= 100) {
			System.out.println("Intervalo (75, 100])");
		
		} else 
			System.out.println("Fora de intervalo");
	
		scanner.close();
	}
		
	
	public static void exercicio7() {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		
		} else if (x > 0 && y == 0) {
			System.out.println("Eixo x");
			
		} else if (x == 0 && y > 0)	{
			System.out.println("Eixo y");
			
		} else if (x < 0 && y == 0) {
			System.out.println("Eixo x");
			
		} else if (x == 0 && y < 0) {
			System.out.println("Eixo y");
		
		} else if (x > 0 && y > 0) {
			System.out.println("Quadrante Q1");

		} else if (x < 0 && y > 0) {
			System.out.println("Quadrante Q2");
			
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante Q3");
				
		} else
			System.out.println("Quadrante Q4");
			
		scanner.close();	
	}
	
	public static void exercicio8() {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double salario = scanner.nextDouble();
		
		
		
		if (salario > 3000 && salario < 4500) {
			double v1 = (8 * 1000) / 100;
			double v2 = salario - 3000;
			double v3 = (18 * v2) / 100;
			double v4 = v1 + v3;
			System.out.printf("R$ %.2f%n", v4);
		}
	}
}
