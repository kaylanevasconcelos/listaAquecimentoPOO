package listsAquecimento;

import java.util.ArrayList;

public class CentralDeInformacoes {
	
	private ArrayList<Aluno> todosOsAlunos;
	
	public ArrayList<Aluno> getTodosOsAlunos() {
		return todosOsAlunos;
	}

	public void setTodosOsAlunos(ArrayList<Aluno> todosOsAlunos) {
		this.todosOsAlunos = todosOsAlunos;
	}

	public boolean adicionarAluno(Aluno aluno) {
		for(Aluno a: todosOsAlunos) {
			if (a.getMatricula().equals(aluno.getMatricula())){
				System.out.println("Matrícula já cadastrada");
				return false;
			}
		}
		return this.todosOsAlunos.add(aluno);
	}
	public Aluno recuperarAlunoPorMatricula(String matricula) {
		for(Aluno a: todosOsAlunos) {
			if (a.getMatricula().equals(matricula)){
				return a;
			}
		}
		return null;
	}
	
}
