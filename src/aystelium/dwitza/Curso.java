package aystelium.dwitza;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private String nomeCurso;
  private String nivelCurso;
  private int cargahorariaCurso;
  private Professor professor;
  private List<Aluno> alunos;

  public Curso(String nome8, String nivel, int ch, Professor p) {
    this.nomeCurso = nome8;
    this.nivelCurso = nivel;
    this.cargahorariaCurso = ch;
    this.professor = p;
    this.alunos = new ArrayList<>();
  }

  public int getAlunosMatriculados() {
    return this.alunos.size();
  }

  public void realizarMatricula(Aluno aluno) {
    this.alunos.add(aluno);
  }

  public void setNome(String nome) {
    this.nomeCurso = nome;
  }

  public void setCh(int ch) {
    this.cargahorariaCurso = ch;
  }

  public String getNome() {
    return this.nomeCurso;
  }

  public String getNivel() {
    return nivelCurso;
  }

  public int getCh() {
    return cargahorariaCurso;
  }

  public Professor getProfessor() {
    return professor;
  }

  public String getNomeProfessor() {
    return this.professor.getNome();
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

}