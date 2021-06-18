import java.util.Scanner;

public class FahrenheiTdowhile {

	public static void main(StringEx[] args) {
		
		double celsius;
		double fahrenheit;
		char resp;
		
		Scanner sc = new Scanner(System.in);
	
		do {
		
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			
			fahrenheit = (9.0 * celsius) / 5.0 + 32.0;
			System.out.printf("A temperatura em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir(s/n) ");
			resp = sc.next().charAt(0);
	
		} while (resp != 'n'); 

		sc.close();
	}
	
}

//Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
//Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
//programa....


// repetindo codigo
/*while(resp != 'n') {
	
	System.out.print("Digite a temperatura em Celsius: ");
	celsius = sc.nextDouble();
	
	fahrenheit = (9.0 * celsius) / 5.0 + 32.0;
	System.out.printf("A temperatura em Fahrenheit: %.1f%n", fahrenheit);
	System.out.print("Deseja repetir(s/n) ");
	resp = sc.next().charAt(0);

}
*/