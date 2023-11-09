package pilhas;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int number, quociente, resto;
		String binario = "";
		
		do {
			System.out.println("Insira um número decimal no intervalo de 0 - 255");
			
				try {
					number = scan.nextInt();
				} catch (Exception e) {
					System.out.println("Valor inválido");
					
				}
			
			
		} while(number < 0 || number > 255);
		
		
		
		if(number == 0) {
			binario += "00";
			
		} else if(number == 1) {
			binario += "01";
			
		} else {
			
			do {
				resto =  number % 2;
				stack.push(resto);
				
				number =  number / 2;
				
				
			} while (number != 1);
			
			stack.push(number); // colocando o ultimo quociente no topo da pilha
			
			while(!stack.isEmpty()) {
				binario += Integer.toString(stack.pop());
			}
		}
		
		System.out.println( "\nBinário:"+binario);
		
		
	}

}
