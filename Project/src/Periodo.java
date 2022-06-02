
public enum Periodo {
	MANHÃ("Matutino"), TARDE("Diurno"), NOITE("Noturno");
	
	protected String text;
	private Periodo(String text) {
		this.text = text;
	}
}
