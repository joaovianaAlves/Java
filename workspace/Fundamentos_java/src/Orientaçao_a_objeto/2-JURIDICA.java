package Orientaçao_a_objeto;

public class JURIDICA extends Pessoa_J{
	public String cnpj;	
	public String inscEstadual;
	@Override
	public String toString() {
		return "JURIDICA [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", nome=" + nome + ", Spessoa=" + Spessoa
				+ "]";
	}

}
