package application;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
	
	public static final double PI = 3.14159; //membro estatico  // final = constante
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius); //funcao circumference recebendo o radius como argumento e devolver o valor dela.
		
		double v = volume(radius);
		
		System.out.printf("Circumference: 	%.2f%n", c);
		System.out.printf("Volume: 	%.2f%n", v);
		System.out.printf("Circumference: 	%.2f%n", c);
		
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume (double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}

}

/* Fazer um programa para ler um valor numérico qualquer, e daí mostrar
   quanto seria o valor de uma circunferência e do volume de uma esfera
   para um raio daquele valor. Informar também o valor de PI com duas
   casas decimais.*/