package ex1;
import java.util.Scanner;  

public class Pessoa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
			
			pessoa_dados das = new pessoa_dados();
			 das.dia_mes_ano = scan.nextInt();
			 das.dados(das.dia_mes_ano);
			

	}

}
