package academico;

public class Matricula {
	private int numero;
	protected Aluno aluno;
	protected DisciplinaLecionada disciplinaLecionada;
	
	public Matricula() {
		aluno = new Aluno();
		disciplinaLecionada = new DisciplinaLecionada();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matricula [numero=");
		builder.append(numero);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append(", disciplinaLecionada=");
		builder.append(disciplinaLecionada);
		builder.append("]");
		return builder.toString();
	}
}
