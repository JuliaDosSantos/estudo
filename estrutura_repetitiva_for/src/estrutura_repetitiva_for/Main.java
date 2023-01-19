package estrutura_repetitiva_for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);
		
		scanner.close();
	}

}
