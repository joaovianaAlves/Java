package Metodo_simples;

public class Carro {
	
	String Modelo;
	String Marca;
	int num_passageiros;
	double cap_do_tanque;
	double com_combustivel;
	
	void exibirAutonomia(){
		System.out.println("autonomia do carro:" + cap_do_tanque * com_combustivel + "km");
		
	}

}
