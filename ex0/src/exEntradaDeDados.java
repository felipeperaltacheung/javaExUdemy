//import java.util.Locale;
import java.util.Scanner;

public class exEntradaDeDados {

	public static void main(StringEx[] args) {
		
		//Locale.setDefault(null);
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//x = sc.next();
		//System.out.println("Digitou: " + x);
		
		//int x;
		//x = sc.nextInt();
		//System.out.println("Digitou: " + x);
		
		//ler float
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Digitou: " + x);
		

		/*Ler um caractere
		char x;
		x = sc.next().charAt(0);
		System.out.println("Digitou: "+ x); // lera o primeiro char */
		
		//Ler varios dados na mesma linha
		StringEx x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
	
}
