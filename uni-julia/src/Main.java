import java.util.Scanner;

import entity.Aluno;
import entity.Curso;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Curso curso = new Curso();
		
		curso.nome = scanner.nextLine();
		curso.preco = 150.00;
		
		Curso curso2 = new Curso();
		
		curso2.nome = "Processos Gerenciais";
		curso2.preco = 100.00;
		
		
		System.out.println(curso.nome);
		System.out.println(curso2.nome);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Lucas Eduardo";
		aluno.email = "lucas123@teste.com";
		aluno.curso = curso;
		
		System.out.println(aluno.curso.nome);
		
		scanner.close();
		
	}

}
