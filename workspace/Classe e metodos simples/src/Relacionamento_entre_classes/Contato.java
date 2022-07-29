package Relacionamento_entre_classes;

public class Contato {

	//ao privar a classe e nescessario gerar getters and setters
	private String nome;
	private contato_endereco endereco;
	private contato_telefone[] telefones;
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public contato_endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(contato_endereco endereco) {
			this.endereco = endereco;
		}
		public contato_telefone[] getTelefones() {
			return telefones;
		}
		public void setTelefones(contato_telefone[] telefones) {
			this.telefones = telefones;
		}
		
}
