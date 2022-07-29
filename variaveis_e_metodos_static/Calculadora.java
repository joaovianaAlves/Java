package variaveis_e_metodos_static;

public class Calculadora {

	// permite usar sem instanciar a classe
	public static int soma(int num1, int num2){
		return num1 + num2;
	}

	public static int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public static double soma(double num1, double num2){
		return num1 + num2;
	}
}