package Exercicio01_getset_overload;

public class teste_lampada {

	public static void main(String[] args) {
		lampada lamp = new lampada();
		
		lamp.ligar();
		lamp.mostraEstado();
		
		lamp.desligar();
		lamp.mostraEstado();
		
		lamp.mudarEstado();
		lamp.mostraEstado();
		
		lamp.mudarEstado();
		lamp.mostraEstado();

	}

}
