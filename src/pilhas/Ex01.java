package pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Ex01 {

		public static void main(String[] args) {

			Stack<Integer> stack = new Stack<Integer>();
			Scanner scan = new Scanner(System.in);
			int elemento;

			System.out.println("Insira 10 números");

			for (int i = 0; i < 10; i++) {
				
				System.out.println("Número\0" + (i + 1) + ":");
				elemento = scan.nextInt();
				
				if (elemento % 2 == 0) {
					stack.push(elemento);
				}
				else {
					try {
						stack.pop();
					} catch (Exception e) {
						System.out.println("A pilha está vazia!");
						//e.printStackTrace();
					} finally{
						continue;
					}
					
					
				}
		
			}
			
			for (int i = 0; i < 10; i++) {
				
				if(stack.empty()) {
					System.out.println("A pilha está vazia!");
					System.out.println("Tchau");
					break;
					 }
				else {
						System.out.println();
						System.out.println(stack.peek());
						stack.pop();
						
		}	
			}
		
			
			
				}
	}


