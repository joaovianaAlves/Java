package Relacionamento_entre_classes;

public class Teste_contato {

	public static void main(String[] args) {
		
		Contato ctt = new Contato();
		//set = setar o valor da variavel
		ctt.setNome("joao");
		
		//criar objeto endereco
		
		contato_endereco end = new contato_endereco();
		end.setNomeRua("rua jorge");
		end.setCep("11373264");
		end.setCidade("Sao Paulo");
		end.setComplemento("NAO POSSUE");
		end.setEstado("SP");
		end.setNumero("221");
			
		ctt.setEndereco(end);
		
		//criar objeto telefone
		
		contato_telefone fone = new contato_telefone();
		fone.setTipo("pessoal");
		fone.setDdd("13");
		fone.setNumero("9999-9999");
		
		contato_telefone fone2 = new contato_telefone();
		fone2.setTipo("casa");
		fone2.setDdd("13");
		fone2.setNumero("8989-8989");
		
		contato_telefone fone3 = new contato_telefone();
		fone3.setTipo("empresa");
		fone3.setDdd("13");
		fone3.setNumero("7989-8979");
		
		contato_telefone[] fones = new contato_telefone[3];
		fones[0] = fone;
		fones[1] = fone2;
		fones[2] = fone3;
		
		//ctt.setTelefone(fone);
		ctt.setTelefones(fones);
		
		//get = pega o valor atribuido a variavel
		System.out.println(ctt.getNome());
		
		//para dar seguranca ao objeto caso for nulo
		//if(ctt != null && ctt.getTelefone() != null){		
			//System.out.println(ctt.getTelefone().getDdd()+ "" + ctt.getTelefone().getNumero()+ "");
		//}
		if(ctt != null && ctt.getEndereco() != null){	
		System.out.println(ctt.getEndereco().getCidade());
			
		}
		
		if(ctt != null && ctt.getTelefones() != null){
			for(contato_telefone t : ctt.getTelefones()){	
				System.out.println(t.getDdd()+ " " + t.getNumero()+ "");
			}
		}
	
	}

}
