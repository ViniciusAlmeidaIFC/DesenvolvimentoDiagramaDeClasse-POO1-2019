package academico;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class MainAcademico {

	public static void main(String[] args) {
		Date date = new Date();
		Aluno aluno = new Aluno();
		Avaliacao avaliacao = new Avaliacao();
		Curso curso = new Curso();
		Disciplina disciplina = new Disciplina();
		DisciplinaLecionada disciplinaLecionada = new DisciplinaLecionada();
		Fase fase = new Fase();
		Frequencia frequencia = new Frequencia();
		Matricula matricula = new Matricula();
		List<Professor> professoresPOO = new ArrayList<Professor>();
		Professor professor = new Professor();
		
		aluno.setCpf(123456);
		aluno.setNome("Vinicius");
		aluno.setCurso(curso);
		curso.setNome("Ciência da Computação");
		disciplina.setNome("Programação Orientado Objeto");
		disciplina.setFase(fase);
		disciplinaLecionada.setAno(2019);
		disciplinaLecionada.setSem(2);
		disciplinaLecionada.setDisciplina(disciplina);
		disciplinaLecionada.setProfessores(professoresPOO);
		fase.setCurso(curso);
		fase.setSemestre(2);
		frequencia.setAulas(40);
		frequencia.setFaltas(5);
		frequencia.setDataHora(date);
		frequencia.setMatricula(matricula);
		frequencia.setProfessor(professor);
		matricula.setAluno(aluno);
		matricula.setNumero(1);
		professor.setNome("Rodrigo");
		professor.setCpf(1234567);
		professoresPOO.add(professor);
		avaliacao.setPeso(1);
		avaliacao.setNota(10);
		avaliacao.setMatricula(matricula);
		avaliacao.setProfessor(professor);
		
		System.out.println("Aluno: "+aluno);
		System.out.println("Avaliação: "+avaliacao);
		System.out.println("Curso: "+curso);
		System.out.println("Disciplina: "+disciplina);
		System.out.println("Disciplina Lecionada: "+disciplinaLecionada);
		System.out.println("Fase: "+fase);
		System.out.println("Frequência: "+frequencia);
		System.out.println("Matricula: "+matricula);
		System.out.println("Professor: "+professor);
		
		
		
		
		
		

	}

}
