package pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exer02 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		Stack<Integer> par = new Stack<Integer>();
		Stack<Integer> impar = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		
		int elemento;

		System.out.println("Insira 10 números");

		for (int i = 0; i < 10; i++) {
			
			System.out.println("Número\0" + (i + 1) + ":");
			elemento = scan.nextInt();
			
			// empilhando na pilha PAR
			if (elemento % 2 == 0) {
				par.push(elemento);
			}
			// empilhando na pilha IMPAR
			else if(elemento % 2 != 0) {
				impar.push(elemento);
			}
			else if(elemento == 0){
				try {
					par.pop();
					impar.pop();
				}
				 catch (Exception e) {
					System.out.println("Uma das pilhas está vazia!");
					//e.printStackTrace();
				} finally{
					continue;
				}  
		}
		}
		
		// desempilhando a pilha PAR
		System.out.println("Desempilhando a Pilha PAR");
				for ( int i = 0; i < 10; i++) {
					
					if(par.empty()) {
						System.out.println("A pilha PAR está vazia!");
						break;
						 }
					else {
							System.out.println(par.peek());
							par.pop();
					}	
			
				}
			
				// desempilhando a pilha IMPAR
				System.out.println("Desempilhando a Pilha IMPAR");
				for ( int i = 0; i < 10; i++) {
					
					if(impar.empty()) {
						System.out.println("A pilha ÍMPAR está vazia!");
						
						break;
						 }
					else {
							
							System.out.println(impar.peek());
							impar.pop();
					}	
			
				}
	
	}
	
}


