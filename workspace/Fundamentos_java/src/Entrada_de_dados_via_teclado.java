import javax.swing.JOptionPane;
import java.util.Scanner;
public class Entrada_de_dados_via_teclado {

	public static void main(String[] args) {
		      //int idade;
			  //idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			  //System.out.println(idade);
			  
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Digite sua idade e nome");
		  String nome = scan.nextLine();// PARA TIPO STRING OU CHAR
		  int idade = scan.nextInt();
		  
	}

}
