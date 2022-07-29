package Metodos_recursivos;

public class calculadora_fatorial {
	
	//metodo recursivo e um metodo que chama ele mesmo, e precisa de um ponto de parada
	// metodo nao recursivo
	public static int fatorial1(int num){
		int total = 1;
		for(int i=num; i>1; i--){
			total *= i;
			}
		return total;
	}
	
	//metodo recursivo
	public static int fatorial(int num){
	
		if(num == 0){
			return 1;
		}
		
		return num * fatorial(num-1);
	}

}
