
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double PI = 3.14159;
		
		double areaTriangulo = A * C / 2.0;
		double areaCirculo = PI * C * C;
		double areaTrapezio = (A + B) / 2.0 * C;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.printf("Triângulo: %.3f%n", areaTriangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);

		
		sc.close();

	}

}
