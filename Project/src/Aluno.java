
public class Aluno extends Pessoa {
	Lista lista = new Lista();
	
	private String turma;
	private String periodo;
	private String ra;
	
	public Aluno(String nome, int idade, String turma, String periodo, String ra) {	
		super(nome, idade);
		this.turma = turma;
		this.periodo = periodo;
		this.ra = ra;
	}
	
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	@Override
	public String toString() {
		return this.getName() + "\n" + getIdade() + "\n" + getPeriodo()+ "\n" 
	+ getTurma() + "\n" + getRa();
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aNovo = (Aluno) obj;
		
		if (this.ra.equals(aNovo.ra))
			return true;
		else
			return false;
	}
}
