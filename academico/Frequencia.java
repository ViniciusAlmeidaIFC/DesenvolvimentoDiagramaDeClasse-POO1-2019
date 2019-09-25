package academico;

import java.util.Date;

public class Frequencia {
	private Date dataHora;
	private int aulas;
	private int faltas;
	protected Professor professor;
	protected Matricula matricula;
	
	public Frequencia() {
		professor = new Professor();
		matricula = new Matricula();
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public int getAulas() {
		return aulas;
	}

	public void setAulas(int aulas) {
		this.aulas = aulas;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
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
		builder.append("Frequencia [dataHora=");
		builder.append(dataHora);
		builder.append(", aulas=");
		builder.append(aulas);
		builder.append(", faltas=");
		builder.append(faltas);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
}
