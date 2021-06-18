//https://docs.oracle.com/javase/tutorial/java/data/strings.html

public class CreatingStrings {

	public static void main(StringEx[] args) {

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		StringEx helloString = new StringEx(helloArray);
		System.out.println(helloString);

		StringEx palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println(len); // 17

	}

}
