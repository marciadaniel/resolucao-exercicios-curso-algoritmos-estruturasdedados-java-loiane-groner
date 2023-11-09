package pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		
		final String SIMBOLOS_DE_ABERTURA = "([{";
		final String SIMBOLOS_DE_FECHAMENTO = ")]}";
		String expressao;
		char simbolo, topo;
		boolean balanceada = true;
		
		
		System.out.println("Insira uma expressão matemática:");
		expressao = scan.nextLine();
		
		for(int i=0; i<expressao.length(); i++) {
			 simbolo = expressao.charAt(i);
			
			if(SIMBOLOS_DE_ABERTURA.indexOf(simbolo) >= 0) {
				stack.push(simbolo);
				
			} else if(SIMBOLOS_DE_FECHAMENTO.indexOf(simbolo) >= 0) {
				if(stack.isEmpty()) {
					System.out.println("Expressão não balanceada!");
					balanceada = false;
					break;
				} else {
					topo = stack.pop();
					
					if (SIMBOLOS_DE_ABERTURA.indexOf(topo) != SIMBOLOS_DE_FECHAMENTO.indexOf(simbolo)){
						System.out.println("Expressão não balanceada!");
						balanceada = false;
						break;
					} 
				}
				
			}
			
			
		}
		
		if(balanceada) {
			System.out.println("Expressão balanceada!");
		}
		
	}

	
	
}
