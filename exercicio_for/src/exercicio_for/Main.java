package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codigoExercicio = entrada.nextInt();
		
		if (codigoExercicio == 1) {
			exercicio1();
		}
		
		if (codigoExercicio == 2) {
			exercicio2();
		}
		
		if (codigoExercicio == 3) {
			exercicio3();
		}
		
		if (codigoExercicio == 4) {
			exercicio4();
		}
	}
	
	public static void exercicio1() {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		if (x >= 1 && x <= 1000) {
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		scanner.close();
	}

	public static void exercicio2() {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++) {
			int x = scanner.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
				
			}	
			
			else {
				out = out + 1;
			}
				
		}
		
		System.out.println("in " + in);
		System.out.println("out " + out);
		
		scanner.close();
		
	}
	
	public static void exercicio3() {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i < N; i++ ) {
			
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		
		}
		
		scanner.close();
		
	}
	
	public static void exercicio4() {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 0; i < N; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			if (B == 0) {
				System.out.println("Divisão impossível");
			}
		
			else {
				double divisao = (double) A / B;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		
		scanner.close();
		
	}
}

