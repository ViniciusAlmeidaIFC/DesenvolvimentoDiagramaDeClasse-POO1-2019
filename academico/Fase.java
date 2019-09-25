package academico;

public class Fase {

	private int semestre;
	protected Curso curso;
	
	public Fase() {
		curso = new Curso();
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [semestre=");
		builder.append(semestre);
		builder.append(", curso=");
		builder.append(curso);
		builder.append("]");
		return builder.toString();
	}
	
	
}
