package application;

import java.util.Scanner;
import entities.CalcEmployee;
import java.util.Locale;

public class Employee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalcEmployee calc = new CalcEmployee();
		
		
		System.out.print("type name: ");
		calc.name = sc.nextLine();
		
		System.out.print("type gross salary ");
		calc.grossSalary = sc.nextDouble();
		
		System.out.println("type tax");
		calc.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employe: " + calc);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		calc.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + calc);
		
		
		sc.close();
	}
	
}
