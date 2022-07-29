package Exercicos01_modificador_static;

public class Teste_contador {

	public static void main(String[] args) {
		//incrementar o contador toa vez que a classe for instanciada
		contador.incremento();
		contador.incremento();
		contador.incremento();
		contador.incremento();
		contador.incremento();
		contador.incremento();
		contador.incremento();
		contador.incremento();
		contador.incremento();
		System.out.println(contador.Mostra_contador());
		System.out.println(contador.zera_contador());
	
	}

}
