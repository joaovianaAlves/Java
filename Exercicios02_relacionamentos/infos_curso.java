package Exercicios02_relacionamentos;

public class infos_curso {
	
	private String nome;
	private String horario;
	private professor prof;
	private alunos[] alunos;
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}
		public professor getProf() {
			return prof;
		}
		public void setProf(professor prof) {
			this.prof = prof;
		}
		public alunos[] getAlunos() {
			return alunos;
		}
		public void setAlunos(alunos[] alunos) {
			this.alunos = alunos;
		}
		
		public String obterinfo(){
			String info = "Nome do curso = " + nome + "\n";
			
			if(prof != null){
				info+= prof.obterinfo();
			}
		
			if(alunos != null){
				System.out.println("---alunos---");
				for(alunos aluno : alunos){
					if(aluno != null){
					info+= aluno.obterinfo();
					info += "\n";
					}
				}
			
				info += "\nMedia da turma = " + obtermediaturma();
			}
		
			return info;
		}
		
	public double obtermediaturma(){
		double soma = 0;
		for(alunos aluno : alunos){
		if(aluno != null){
			soma += aluno.obtermedia();
			}
		}
		return soma/alunos.length;
	}
}
