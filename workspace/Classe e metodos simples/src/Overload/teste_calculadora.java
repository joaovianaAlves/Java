package Overload;

public class teste_calculadora {

	public static void main(String[] args) {
		MinhaCalculadora calc = new MinhaCalculadora();
		
		calc.soma(1, 2);
		calc.soma(1.0, 2.0);
		
	}

}
