package Orientaçao_a_objeto;

public class Pessoa_f {

	public static void main(String[] args) {
		
		//HERANÇA
		FISICA fis = new FISICA();
		JURIDICA jur = new JURIDICA();
		
		fis.nome = "João";
		fis.cpf = "37465338808";
		fis.rg = "54246363";
		fis.Spessoa = "A";
		
		jur.cnpj = "123123311";
		jur.nome = "casabahia";
		jur.inscEstadual = "2316463";
		jur.Spessoa = "I";
		
		System.out.println("Dados pessoal fisica");
		System.out.println(fis.toString());
		System.out.println("Dados pessoal juridica");
		System.out.println(jur.toString());
	}

}
