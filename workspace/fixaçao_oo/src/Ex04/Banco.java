package Ex04;

public class Banco {

	public static void main(String[] args) {
		conta cont = new conta();
		cont.numero_da_conta = 1434535;
		cont.saldo = 5037.85;
		cont.especial = false;
		cont.limite = 2500;
		
		System.out.println(cont.numero_da_conta);
		System.out.println(cont.saldo);
		System.out.println(cont.especial);
		System.out.println(cont.limite);
		
		
	}

}
