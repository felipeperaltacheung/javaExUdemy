package application;

import java.util.Scanner;
import entities.CalcRectangle;


public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalcRectangle rectangle = new CalcRectangle();
		
		System.out.println("Enter rectangle width and height:  ");
		rectangle.width  = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("the area is: " + rectangle.area());
		System.out.println("the perimeter is: " + rectangle.perimeter());
		System.out.println("the diagonal is: " + rectangle.diagonal());
		
		sc.close();
	}

}


/*  Fazer um programa para ler os valores da largura(width) e altura(height)
	de um retângulo. Em seguida, mostrar na tela o valor de
	sua área, perímetro e diagonal. Usar uma classe como
	mostrado no projeto ao lado. 
	
	Class = Rectangle
	Atrib = width; height (double)
	Met   = area; perimeter; diagonal; (double)
	
	
*/