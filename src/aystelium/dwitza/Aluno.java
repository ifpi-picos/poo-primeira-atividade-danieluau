package aystelium.dwitza;

public class Aluno {
  private String nomeAluno;
  private String emailAluno;

  public Aluno(String nome, String email) {
    this.nomeAluno = nome;
    this.emailAluno = email;
  }

  public void setNome(String nome) {
    this.nomeAluno = nome;
  }

  public String getNome() {
    return nomeAluno;
  }

  public String getEmail() {
    return emailAluno;
  }

}