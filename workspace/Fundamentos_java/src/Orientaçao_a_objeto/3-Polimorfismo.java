package Orientaçao_a_objeto;

public class Polimorfismo {

	public static void main(String[] args) {
		
		Mamamifero mami1 = new Elefante();
		System.out.println("Cota diaria elefante:" + mami1.cotadeleite());
	
		Mamamifero mami2 = new rato();
		System.out.println("Cota diaria rato:" + mami2.cotadeleite());
	}

}
