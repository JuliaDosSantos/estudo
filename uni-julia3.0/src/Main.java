import java.util.ArrayList;
import java.util.List;

import entity.Aluno;
import entity.Curso;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = criarCurso("Análise e desenvolvimento de sistemas", 150.00);
		Curso curso2 = criarCurso("Processos Gerenciais", 100.00);
		
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		
		Aluno aluno1 = criarAluno("Lucas Eduardo", "lucas@teste.com.br", cursos);

	}
	
	public static Curso criarCurso(String nome, double preco) {
		
		Curso curso = new Curso();
		curso.nome = nome;
		curso.preco = preco;
		
		return curso;
	}
	
	public static Aluno criarAluno(String nome, String email, List<Curso> cursos) {
		
		Aluno aluno = new Aluno();
		aluno.nome = nome;
		aluno.email = email;
		aluno.cursos = cursos;
		
		return aluno;
		
	}

}
