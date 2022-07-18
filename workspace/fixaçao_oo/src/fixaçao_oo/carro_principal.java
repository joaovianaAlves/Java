package fixaçao_oo;

public class carro_principal {

	public static void main(String[] args) {
		carro van = new carro();
		van.Marca = "Fiat";
		van.Modelo = "Ducato";
		van.num_passageiros = 7;
		van.cap_do_tanque = 100.3;
		van.com_combustivel = 31;
		
		System.out.println(van.Marca);
		System.out.println(van.Modelo);
		System.out.println(van.num_passageiros);
		System.out.println(van.cap_do_tanque);
		System.out.println(van.com_combustivel);

		
	}

}
