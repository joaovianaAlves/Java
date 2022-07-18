package Exercico02_metodo;

import java.util.Scanner;

public class cliente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		contacorrente conta = new contacorrente();
		
		System.out.println("Digite o seu numero de conta:");
		conta.numero = scan.nextInt();
		conta.limite = 1000;
		conta.saldo = 0;
		System.out.println("Digite a quantia a sacar:");
		conta.saque = scan.nextInt();
		
		
		conta.sacar_dinheiro();
		System.out.println("saldo atual:" +conta.saldo);
		System.out.println("limite atual:" +conta.limite);
		
		
		
	}

}
