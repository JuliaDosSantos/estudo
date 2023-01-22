import java.util.ArrayList;
import java.util.List;

import entity.Aluno;
import entity.Curso;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.nome = "Análise e desenvolvimento de sistemas";
		curso1.preco = 150.00;
		
		Curso curso2 = new Curso();
		
		curso2.nome = "Processos gerenciais";
		curso2.preco = 100.00;
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Lucas Eduardo";
		aluno1.email = "lucas@teste.com.br";
		
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		
		aluno1.cursos = cursos;
		
		for (Curso curso : aluno1.cursos) {
			System.out.println(curso.nome);
		}
		
		System.out.println("Segundo for");
		
		for (int index = 0; index < aluno1.cursos.size(); index++) {
			System.out.println(aluno1.cursos.get(index).nome);
		}
		
		System.out.println("Terceiro for");
		
	
		aluno1.cursos.forEach(curso -> {
			System.out.println(curso.nome);
		});
	}

}
