package Exercicios02_relacionamentos;

import java.util.Scanner;

public class principal_curso {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso");
		String nome = scan.nextLine();
		
		System.out.println("Entre com o horario do curso");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do professor");
		String nomeprof = scan.nextLine();
		
		System.out.println("Entre com o departamento do professor");
		String depprof = scan.nextLine();
		
		System.out.println("Entre com o email do professor");
		String emailprof = scan.nextLine();
		
		infos_curso infos = new infos_curso();
		infos.setNome(nome);
		infos.setHorario(horario);
		
		professor pf = new professor();
		pf.setNome(nomeprof);
		pf.setDepartamento(depprof);
		pf.setEmail(emailprof);
		
		infos.setProf(pf);
		
		System.out.println("----Alunos----");
		
		alunos[] alunos = new alunos[3];
		for(int i=0; i<3; i++){
			
			scan.nextLine(); 
			
			System.out.println("Entre com o nome do aluno"+ (i+1));
			String nomeAluno = scan.nextLine();
			
			System.out.println("Entre com a matricula do aluno"+ (i+1));
			String matAluno = scan.nextLine();
			
			System.out.println("Entre com a nota do aluno"+ (i+1));
			String notaAluno = scan.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0; j<4; j++){
				System.out.println("Entre com a nota"+(j+1));
				notas[j] = scan.nextDouble();
			}
			
			alunos aluno = new alunos();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i]= aluno;
			
		}
		
		infos.setAlunos(alunos);
		
		System.out.println(infos.obterinfo());
	}

}
