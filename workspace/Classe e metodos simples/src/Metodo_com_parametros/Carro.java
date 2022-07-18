package Metodo_com_parametros;

public class Carro {
	
	String Modelo;
	String Marca;
	int num_passageiros;
	double cap_do_tanque;
	double com_combustivel;
	
	void exibirAutonomia(){
		System.out.println("autonomia do carro:" + cap_do_tanque * com_combustivel + "km");
	}
	
	double Obter_autonomia(){
		System.out.println("Metodo obterautonomia foi chamado");
		
		return cap_do_tanque * com_combustivel;	
	}
	
	double calculaComb(double km){
		
		double qtdcomb = km/com_combustivel;
		return qtdcomb;
		
	}

}
