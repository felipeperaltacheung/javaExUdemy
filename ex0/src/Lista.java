import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Lista {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("jose");
		nomes.add("ana");
		nomes.add("joao");
		nomes.remove(0);
		
		///System.out.println(nomes); //[ana, joao]
		
		// -------------------------
		///for (int i = 0; i < nomes.size(); i++) {
		//	System.out.println("Nome:" + nomes.get(i));
		//}
		
		// -------------------------
		///for (String nome : nomes) { //@enhanced for loop.
		//	System.out.println("Nome:" + nome);
		//}
		
		// -------------------------
		///nomes.forEach(new Consumer<String>() {

		//	@Override
		//	public void accept(String t) {
		//		System.out.println(t);
				
		//	}
			
		//});
		
		// -------------------------
		///nomes.forEach(nome -> System.out.println(nome)); //@lambda expression
		
		nomes.forEach(System.out::println); //@method reference 
		
	}
	
}
