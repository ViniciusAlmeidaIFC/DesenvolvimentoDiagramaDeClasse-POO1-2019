package academico;

public class Disciplina {

	private String nome;
	protected Fase fase;
	
	public Disciplina() {
		fase = new Fase();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", fase=");
		builder.append(fase);
		builder.append("]");
		return builder.toString();
	}
	
	
}
