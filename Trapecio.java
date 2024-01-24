// Trapecio.java
package figuras;

import java.util.Scanner;

public class Trapecio {
	public static void calculateArea() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de la base mayor del trapecio:");
		double baseMayor = scanner.nextDouble();
		
		System.out.println("Introduce la longitud de la base menor del trapecio:");
		double baseMenor = scanner.nextDouble();
		
		System.out.println("Introduce la altura del trapecio:");
		double altura = scanner.nextDouble();
		
		double area = (baseMayor + baseMenor) * altura / 2;
		
		System.out.println("El área del trapecio es: " + area);
		scanner.close();
	}
}