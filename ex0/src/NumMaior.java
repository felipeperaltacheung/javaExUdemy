import java.util.Scanner;

public class NumMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);  //instanciado funcao1 que pega tres numeros inteiros
		
		showResult(higher);          //instanciando funcao2 showResult mostra resultado do valor higher 
		
		sc.close();
	}
	
	public static int max(int x, int y, int z){ // criando funcao1 max que pega tres numeros inteiros
		int aux;
		if (x > y &&  x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
		
	}
	
	public static void showResult(int value) {   //criando funcao2 mostra resultado do valor higher 
		System.out.println("Higher = " + value);
	}
	
}
