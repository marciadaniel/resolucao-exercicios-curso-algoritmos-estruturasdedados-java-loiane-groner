package pilhas;


import java.util.Date;

public class Livro {

	private String nome;
	private int isbn;
	private Date data;
	private String autor;
	
	public Livro(String nome, int isbn, Date data,
			String autor){
		
		this.nome = nome;
		this.isbn = isbn;
		this.data = data;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + "\n isbn=" + isbn + "\n data=" + data + "\n autor=" + autor + "]";
	}
	
	
}
