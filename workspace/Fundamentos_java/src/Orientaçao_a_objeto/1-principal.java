package Orientaçao_a_objeto;

public class principal {

	public static void main(String[] args) {
		
		instancia da classe
		Pessoa pes = new Pessoa();
		pes.setNomepessoa("joao vitor viana alves");
		pes.setIdadepessoa(18);
		System.out.println(pes.toString());
		
		
		//pes.idadepessoa = 18;
		//pes.nomepessoa = "joao vitor viana";
		//pes.mostraDados(pes.nomepessoa, pes.idadepessoa);
		
	}

}