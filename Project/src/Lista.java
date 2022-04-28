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
			Aluno vetAux[] = new Aluno[vet.length];
			for (int i = 0; i < vet.length; i++) {
				vetAux[i] = vet[i];
				
			}
			vet = vetAux;
		}
		vet[posicao] = aluno; 
		posicao++;
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
		for (int i = num; i < vet.length; i++) {
			vet[i] = vet[i + 1];
		}
		vet[vet.length - 1] = null;
		posicao--;
	}
	
	public boolean localizar(Aluno aluno) {
		for (int i = 0; i < vet.length; i++) {
			if(vet[0].equals(aluno))
				return true;
				
		}
		return false;
	}
	
	public void imprimirLista() {
		System.out.println(Arrays.toString(vet));
	}
	
	public void buscarIndex(Aluno aluno) {
		
	}
}
