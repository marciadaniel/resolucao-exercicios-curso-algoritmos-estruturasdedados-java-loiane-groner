package pilhas;

import java.util.Scanner;
import com.loiane.estruturadados.pilha.Pilha;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Pilha<Livro> stack = new Pilha<Livro>(20);

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
			stack.empilha(livro);
			stack.toString();
		}

		while (!(stack.estaVazia())) {

			System.out.println("Desempilhando:");
			System.out.println("Último elemento:" + stack.topo());
			stack.desempilha();
			System.out.println("Pilha:");
			stack.toString();
			System.out.println("Tamanho da pilha:" + stack.tamanho());
		}

		System.out.println("A pilha está vazia!");

	}
}
