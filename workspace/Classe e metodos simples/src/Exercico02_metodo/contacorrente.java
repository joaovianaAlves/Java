package Exercico02_metodo;

import java.util.Scanner;

public class contacorrente {
	Scanner scan = new Scanner(System.in);

	double saldo;
	int numero;
	int limite;
	int saque;
	char character;
	
	double sacar_dinheiro(){
		if(saldo > 0){
			System.out.println("saque autorizado, digite a quantia a sacar: " +saque);
			return saldo - saque;
		}else{
			System.out.println("saque não autorizado");
			System.out.println("Gostaria de utilzar o limite? (S/N)");
			character = scan.next().charAt(0);
			if(character == 's'){
				limite = limite-saque;
			}else{
				if(character == 'n'){
				   System.out.println("saque cancelado");
				}
				
			}
			return limite;
		}
		
		
		
		
	}
	
	double depositar_dinheiro(double dinheiro){
		
		double valordep = dinheiro;
		return valordep + saldo;
		
		}
	}
 	
 
