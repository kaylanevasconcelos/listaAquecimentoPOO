import java.util.ArrayList;
import java.util.Scanner;

import listsAquecimento.Aluno;
import listsAquecimento.CentralDeInformacoes;
import listsAquecimento.Persistencia;
import listsAquecimento.Sexo;

public class Main {

	public static void main(String[] args) {

		Persistencia persistencia = new Persistencia();
		Scanner input = new Scanner(System.in);
		CentralDeInformacoes central = persistencia.recuperarCentral("central.xml");
		
		System.out.println("\n1 - novo aluno " +
				"\n2 - listar todos os alunos " +
				"\n3 - exibir informações de um aluno especifico " +
				"\nS - sair ");
		System.out.print("Digite uma opção: ");
		String opcao = input.nextLine();
		
		while(!opcao.toUpperCase().equals("S")) {
			if (opcao.equals("1")) {
				System.out.print("Digite o nome do aluno: ");
				String nome = input.nextLine();
				System.out.print("Digite o sexo do aluno: ");
				Sexo sexo = Sexo.valueOf(input.nextLine());
				System.out.print("Digite a matricula do aluno: ");
				String matricula = input.nextLine();
				System.out.print("Digite o e-mail do aluno: ");
				String email = input.nextLine();
				System.out.print("Digite a senha do aluno: ");
				String senha = input.nextLine();
			}else if(opcao.equals("2")) {
				ArrayList<Aluno> alunos = central.getTodosOsAlunos();
				if (alunos.size() == 0) {
					System.out.println("Não há alunos cadastrados!");
				}else {
					for (Aluno aluno : alunos) {
						System.out.println(aluno);
					}
					
				}
			}else if(opcao.equals("3")) {
				System.out.print("Digite a matricula do aluno: ");
				String matricula = input.nextLine();
				System.out.println(central.recuperarAlunoPorMatricula(matricula));
			}
			System.out.print("Digite uma opção: ");
			opcao = input.nextLine();
		}
	}

}
