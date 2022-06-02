import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Instância
		Lista listinha = new Lista();
		Scanner scNum = new Scanner(System.in);
		Scanner scText = new Scanner(System.in);

		//Memórias
		int opcao = 0;
		int idade = 0;
		String nome, ra, turma, periodo;
		Path p = Paths.get("C:\\Users\\Sony\\Desktop\\Banco.txt" );

		//Validar
		if (Files.exists(p)) {
			Aluno aluno;
			String[] vetor;
			List<String> linhas = GravacaoAlunoTxt.lerArq("Banco.txt");

			for (String string : linhas) {
				vetor = string.split(";");
				aluno = new Aluno(vetor[0], Integer.parseInt(vetor[1]), vetor[2], vetor[3], vetor[4]);
				listinha.adicionar(aluno); 
			}	
		}

		//Inicio da lista
		System.out.println("Seja bem vindo ao nosso sistema de lista de alunos"
				+ " \t Achamos o nosso alunos por RA. \n");		
		do {

			System.out.println("Escolha a operção desejada:"); 
			System.out.println("1 . Cadastrar Aluno"); 
			System.out.println("2 . Alterar Aluno"); 
			System.out.println("3 . Excluir Aluno"); 
			System.out.println("4 . Listar todos os Alunos");
			System.out.println("9 . Sair do Sistema"); 

			opcao = scNum.nextInt();
			Aluno al;
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do aluno");
				nome = scText.nextLine();

				System.out.println("Digite a idade do aluno");
				idade = scNum.nextInt();

				System.out.println("Digite a turma do aluno");
				turma = scText.nextLine();

				System.out.println("Digite o periodo do aluno \n"
						+ "[Matutino] \n"
						+ "[Diurno] \n"
						+ "[Noturno]");
				periodo = scText.nextLine();
				boolean validar = true;
				do {
					switch (periodo.toLowerCase()) {
					case "matutino":
						periodo = Periodo.MANHÃ.text;
						validar = false;
						break;
					case "diurno":
						periodo = Periodo.TARDE.text;
						validar = false;
						break;
					case "noturno":
						periodo = Periodo.NOITE.text;
						validar = false;

					default:
						System.err.println("Dados Inseridos Inválidos");
						break;
					}
				} while (validar);
				System.out.println("Digite o RA do aluno");
				ra = scText.nextLine();
				
				al = new Aluno(nome, idade, turma, periodo, ra);
				listinha.adicionar(al);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				listinha.imprimirLista();
				try {
					Thread.sleep(1200);
					System.out.println();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				break;
			case 9:
				break;

			default:
				break;
			}
		} while (opcao != 9);
	}

}
