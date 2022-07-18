package Ex03;

import java.util.Date;

public class BLIBLIOTECA {

	public static void main(String[] args) {
		
		LivroDeLivraria liv = new LivroDeLivraria();
		
		liv.autor = "joao";
		liv.editora = "abc.org";
		liv.qtdpaginas = 1230;
		liv.valor = 49.99;
		
		liv.emprestado = true;
		liv.Dataentrega = new Date();
		
		System.out.println("Nome do autor:"+ liv.autor);
		
	}
}
