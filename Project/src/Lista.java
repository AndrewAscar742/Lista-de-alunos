import java.util.Arrays;

public class Lista {
	private Aluno vet[];
	private int posicao;

	public Lista(int tamanho) {
		vet = new Aluno[tamanho];
	}

	public Lista() {
		vet = new Aluno[3];
	}

	public void adicionar(Aluno aluno) {
		if(posicao == vet.length) {
			Aluno vetAux[] = new Aluno[vet.length * 2];
			for (int i = 0; i < vet.length; i++) {
				vetAux[i] = vet[i];

			}
			vet = vetAux;
		}
		vet[posicao] = aluno;
		posicao++;
		GravacaoAlunoTxt.gravarArq(formatarAluno(), "Banco.txt");
		
	}

	private String formatarAluno() {
		String alunoF = "";
		Aluno al;
		al = vet[posicao - 1];
		alunoF = al.getName() + ";" + al.getIdade() + ";" + al.getPeriodo() + ";" + al.getTurma() + ";"
				+ al.getRa() + "\n";

		return alunoF;
	}

	public boolean alterar(Aluno aluno) {
		if (posicao > vet.length)
			return false;
		else {
			vet[posicao] = aluno;
			return true;
		}

	}

	public void excluir(int num) {
		for (int i = num; i < posicao; i++) {
			vet[i] = vet[i + 1];
		}
		vet[vet.length - 1] = null;
		posicao--;
	}

	public String localizarIndex(String ra) {
		for (int i = 0; i < posicao; i++) {
			if(ra.equals(vet[i]))
				return vet[i].getRa();
		}
		return null;
	}

	public Aluno localizarAluno(int num) {
		if(num < posicao && num > -1)
			return vet[num];

		return null;
	}

	public void imprimirLista() {
		System.out.println(Arrays.toString(vet));
	}
	


}
