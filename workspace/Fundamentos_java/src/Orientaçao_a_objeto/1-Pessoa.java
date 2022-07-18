package Orientaçao_a_objeto;

public class Pessoa {
		
	//atributos
	    //Classe
        private String nomepessoa; 
		private int idadepessoa;
		
		//encapsulamento de dados
		@Override
		public String toString() {
			return "Pessoa [nomepessoa=" + nomepessoa + ", idadepessoa=" + idadepessoa + "]";
		}
		public String getNomepessoa() {
			return nomepessoa;
		}
		public void setNomepessoa(String nomepessoa) {
			this.nomepessoa = nomepessoa;
		}
		public int getIdadepessoa() {
			return idadepessoa;
		}
		public void setIdadepessoa(int idadepessoa) {
			this.idadepessoa = idadepessoa;
		}
		
		
		//metodo
		//public void mostraDados(String pNome, int pIdade) {
		
			//System.out.println("Nome: " + pNome);
			//System.out.println("idade: " + pIdade);
		//}

		
}	