package pilhas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.util.Stack;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<Livro> stack = new Stack<Livro>();

		Date data = new Date();
		String autor;
		int isbn;
		String nome;

		for (int i = 0; i < 6; i++) {
			System.out.println("Insira os dados do livro:");

			System.out.println("Nome:");
			nome = scan.nextLine();

			System.out.println("Data de lançamento:");
			String date;
			date = scan.nextLine();
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
				

				data = formatter.parse(date);
			} catch (ParseException e) {

				e.printStackTrace();
			}

			System.out.println("ISBN:");
			isbn = scan.nextInt();
			scan.nextLine();

			System.out.println("Autor:");
			autor = scan.nextLine();

			Livro livro = new Livro(nome, isbn, data, autor);
			stack.push(livro);
			stack.toString();
		}

		while (!(stack.isEmpty())) {

			System.out.println("Desempilhando:");
			System.out.println("Último elemento:" + stack.peek());
			stack.pop();
			System.out.println("Pilha:");
			stack.toString();
			System.out.println("Tamanho da pilha:" + stack.size());
		}

		System.out.println("A pilha está vazia!");

	}

}
