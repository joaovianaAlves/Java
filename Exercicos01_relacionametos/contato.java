package Exercicos01_relacionametos;

public class contato {
	
	private String nome;
	private String telefone;
	private String email;
		
	public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmal() {
			return email;
		}
		public void setEmal(String emal) {
			this.email = emal;
		}
	
		public String obterinfo(){
			return "nome = " + nome + ";" +
					"telefone = " + telefone + ";" +
					 "email = " + email + ";" ;
		}
}
