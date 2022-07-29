package Exercicos01_relacionametos;

public class Agenda {

	private String nome;
	private contato[] contatos;

			public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
        
			public contato[] getContatos() {
			return contatos;
		}
	
		public void setContatos(contato[] contatos) {
			this.contatos = contatos;
		}

		public String obterinfo(){
			String info = "nome = " + nome + "\n";
			
			if(contatos != null){
				for(contato c : contatos){
					info += c.obterinfo() + "\n";
				}
			}
			
			return info;
			
		}
}
