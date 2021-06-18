package application;

public class ForEach1 {

	public static void main(String[] args) {
		
		String [] vect = new String[] {"maria", "bob", "alex"};
		
		//for (int i=0; i< vect.length; i++){ //for normal
		//	System.out.println(vect[i]);
		//}
		
		for (String obj: vect) { // laco foreach
			System.out.println(obj);
		}
	}
	
}
