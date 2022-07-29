package Exercicos01_modificador_static;

public class contador {
	
	//declaracao da variavel static
	static int contador;
	
	//metodo static
	public static void incremento(){
		contador++;
	}
	
	public static int Mostra_contador(){
		return contador;
	}
	
	public static int zera_contador(){
			contador = 0;
		return contador;
	}
	

}
