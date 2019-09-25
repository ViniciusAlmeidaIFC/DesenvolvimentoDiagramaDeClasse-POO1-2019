package academico;

public class Avaliacao {

	private float nota;
	private float peso;
	protected Professor professor;
	protected Matricula matricula;
	
	public Avaliacao() {
		professor = new Professor();
		matricula = new Matricula();
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avaliacao [nota=");
		builder.append(nota);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	
}
