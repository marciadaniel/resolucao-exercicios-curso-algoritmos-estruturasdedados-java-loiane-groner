package pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack();
		String palavra;
		
		
		System.out.println("Insira uma palavra:");
		palavra = scan.nextLine();
		
		for(int i=0; i<palavra.length(); i++) {
			
			stack.push(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		
		for(int i=0; i<palavra.length(); i++) {
			
			palavraInversa += stack.pop();
			
		}
		
		if(palavra.equalsIgnoreCase(palavraInversa)) {
			
			System.out.println("A palavra "+ palavra +" é um palíndromo!");
		} 
		else {
			System.out.println("A palavra "+ palavra +" não é um palíndromo!");
		}
	}

}
