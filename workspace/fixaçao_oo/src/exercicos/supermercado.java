package exercicos;

public class supermercado {

	public static void main(String[] args) {
		lampada lamp = new lampada();
		
		lamp.valor = 5;
		lamp.estaemestock = "sim";
		lamp.potencia = 8;
		lamp.cor = "branca";
		lamp.tipos = new String[2];
		lamp.tipos[0] = "Abajur";
		lamp.tipos[1] = "lampiao";
		lamp.tipos[2] = "Carro";
		
		System.out.println(lamp.valor);
		System.out.println(lamp.estaemestock);
		System.out.println(lamp.potencia);
		System.out.println(lamp.cor);

		
	}

}
