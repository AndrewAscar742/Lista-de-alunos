
public class Main {

	public static void main(String[] args) {
		//Inst�ncia
		Lista listinha = new Lista();
		
		System.out.println("Seja bem vindo ao nosso sistema de lista de alunos"
				+ "Achamos o nosso alunos por RA.");
		
		Aluno a1 = new Aluno();
		a1.setName("Andrew");
		a1.setIdade(18);
		a1.setPeriodo("Tarde");
		a1.setRa("40001");
		a1.setTurma("1DN");
		
		listinha.adicionar(a1);
		
		System.out.println(listinha.localizar(a1) ? "Alvo localizado" : "Alvo n�o localizado");
		
		listinha.imprimirLista();
	}

}
