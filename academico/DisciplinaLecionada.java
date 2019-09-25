package academico;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaLecionada {

	private int ano;
	private int sem;
	protected Disciplina disciplina;
	protected List<Professor> professores;
	
	public DisciplinaLecionada() {
		disciplina = new Disciplina();
		professores = new ArrayList<Professor>();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		if (professores.size() <= 4) 
		this.professores = professores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DisciplinaLecionada [ano=");
		builder.append(ano);
		builder.append(", sem=");
		builder.append(sem);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append(", professores=");
		builder.append(professores);
		builder.append("]");
		return builder.toString();
	}
	
	
}
