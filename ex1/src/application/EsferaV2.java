package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

//versao com "delegacao"

public class EsferaV2 {
	
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); //metodo estatico //circumference posso utilizar esse membro independente de objto
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: 	%.2f%n", c);
		System.out.printf("Volume: 	%.2f%n", v);
		System.out.printf("Circumference: 	%.2f%n", Calculator.PI); // constante 
		
		
		sc.close();
	}
	
	

}

/* Fazer um programa para ler um valor numérico qualquer, e daí mostrar
   quanto seria o valor de uma circunferência e do volume de uma esfera
   para um raio daquele valor. Informar também o valor de PI com duas
   casas decimais.*/