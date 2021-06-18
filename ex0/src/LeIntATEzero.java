
import java.util.Scanner;

public class LeIntATEzero {

	public static void main(StringEx[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);

		sc.close();
	}

}













