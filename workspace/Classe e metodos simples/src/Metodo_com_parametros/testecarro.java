package Metodo_com_parametros;

public class testecarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.Marca = "Fiat";
		van.Modelo = "Ducato";
		van.num_passageiros = 7;
		van.cap_do_tanque = 50;
		van.com_combustivel = 0.2;
		
		System.out.println(van.Marca);
		System.out.println(van.Modelo);
		System.out.println(van.num_passageiros);
		System.out.println(van.cap_do_tanque);
		System.out.println(van.com_combustivel);
		
		van.exibirAutonomia();
		
		double autonomia = van.Obter_autonomia();
		System.out.println("A autonomia do carro e: "+ van.Obter_autonomia());
		
		double qtdcomb = van.calculaComb(10);
		
		System.out.println("qtdcombsutivel = " +van.calculaComb(10));
		

		}
	}



