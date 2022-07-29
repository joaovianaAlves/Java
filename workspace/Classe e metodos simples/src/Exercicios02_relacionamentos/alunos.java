package Exercicios02_relacionamentos;

public class alunos {

	private String nome;
	private String matricula;
	private double[] notas;
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public double[] getNotas() {
			return notas;
		}
		public void setNotas(double[] notas) {
			this.notas = notas;
		}
	
		public String obterinfo(){
			String info = "nome aluno = " +nome + ";";
			info += "Mtricula = "+ matricula + ";";
			info += "Notas: ";
			double soma = 0;
			for(double nota : notas){
				soma += nota;
				info += nota + " ";
			}
			double media = soma/4;
			info += "\n" + "media = " + media + " - ";
			if(media >= 7){
				info += "Aprovado";
			}else{
				info+= "Reprovado";
			}
			
			return info;
		}
		
		public double obtermedia(){
			double soma = 0;
			for(double nota : notas){
				soma += nota;
			}
		return soma/4;	
	}
}
