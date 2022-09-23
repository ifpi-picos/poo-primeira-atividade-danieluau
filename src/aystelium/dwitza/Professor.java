package aystelium.dwitza;

public class Professor {
  private String nomeProfessor;

  public Professor(String nome) {
    this.nomeProfessor = nome;
  }

  public String getNome() {
    return nomeProfessor;
  }

  public void setNome(String nome) {
    this.nomeProfessor = nome;
  }
}