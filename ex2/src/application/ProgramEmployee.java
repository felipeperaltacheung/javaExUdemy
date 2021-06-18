package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.EmployeeList;

public class ProgramEmployee {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeList> list = new ArrayList<>(); //Criando a lista de empregados 
	
		// Parte 1 - READING DATA:
		
		System.out.println("How many employees will be registered: ");
		int Nemployees = sc.nextInt();
		
		for(int i=0; i<Nemployees; i++) {
			System.out.println("Employee #"+ (i + 1) + ":");
			
			System.out.print("Id: " );
			Integer id = sc.nextInt();
			System.out.print("Name: " );
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: " );
			Double salary = sc.nextDouble();
			
			EmployeeList emp = new EmployeeList(name, id, salary); //instanciando a lista?
					
			list.add(emp);
			
			
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		
		EmployeeList emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null); // busca usando o stream
		 
		//Integer pos = position(list, idsalary);
		
		if (emp == null) {
			System.out.println("This id does not exist");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
	
		
		System.out.println();
		System.out.println("List of employees:");
		for(EmployeeList e : list) {
			System.out.println(e);
		}
		
		
		sc.close();
	}

	public static Integer position(List<EmployeeList> list, int id) { //funcao ou metodo pra busca o id na lista
		for(int i = 0; i< list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}


/*  https://github.com/acenelio/list1-java && https://www.youtube.com/watch?v=Xj-osdBe3TE
**Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
**N funcionários. Não deve haver repetição de id.
**Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
**Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
**mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
**conforme exemplos.
**Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
**ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
**aumento por porcentagem dada.
*/