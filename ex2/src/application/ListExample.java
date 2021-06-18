package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<>();
				
		mylist.add("maria");
		mylist.add("malex");
		mylist.add("bob");
		mylist.add("manna");
		mylist.add(2, "misa");
		mylist.add(2, "tadeu");
		
		for(String x : mylist) {
			System.out.println(x);
		}
		
		System.out.println(mylist); // [maria, malex, tadeu,  misa, bob, manna]
		System.out.println(mylist.size()); //6
		System.out.println(mylist.remove("bob")); // or mylist.remove(2); 
		System.out.println(mylist); //[maria, malex, tadeu, misa, manna]
 		
		System.out.println("=======//=============//======");
		
		//remover da lista aquele que atenda a um predicado ex: remover nomes que comecam com a letra m
		//mylist.removeIf(x -> x.charAt(0) == 'm');  // predicado - funcao lambda
		System.out.println(mylist);  // [tadeu]
		
		System.out.println("Index of bob: " + mylist.indexOf("bob")); // -1
		System.out.println("Index of tadeu: " + mylist.indexOf("tadeu")); // 0
		
		List<String> result = mylist.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());
		System.out.println(result); //[maria, malex, misa, manna]
		List<String> result2 = mylist.stream().filter(x -> x.charAt(1) == 'm').collect(Collectors.toList());
		System.out.println(result2); //

		
		System.out.println("=======//=============//======");
		
		String name = mylist.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
		System.out.println(name); //maria
	}
	
}
