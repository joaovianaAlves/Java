package Exercio01_metodo;

public class Test_lampada {

	public static void main(String[] args) {
		
		lampada lamp = new lampada();
		
		lamp.valor = 5;
		lamp.estaemestock = "sim";
		lamp.potencia = 8;
		lamp.cor = "branca";
		
		System.out.println(lamp.valor);
		System.out.println(lamp.estaemestock);
		System.out.println(lamp.potencia);
		System.out.println(lamp.cor);
		
		lamp.ligar();
		System.out.println("lampada esta:" + lamp.ligada);
		lamp.desligar();
		System.out.println("lampada esta:"+ lamp.ligada);
		
		
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