package exercicio_for;

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
		
	}
}