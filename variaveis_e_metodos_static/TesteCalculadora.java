package variaveis_e_metodos_static;

public class TesteCalculadora {

	public static void main(String[] args) {
		 
		//Calculadora calc = new Calculadora();
		
		int soma1 = Calculadora.soma(49, 51);
		System.out.println(soma1);
		
		int soma2 = Calculadora.soma(23, 27, 50);
		System.out.println(soma2);
		
	double soma3 = Calculadora.soma(50.50, 49.50);
		System.out.println(soma3);
	}

}
