package br.com.dio.model;

public class Gato {
  private String nome;
  private int idade;
  private int poder;

  public Gato() {
  }

  public Gato(String nome, int idade, int poder) {
    this.nome = nome;
    this.idade = idade;
    this.poder = poder;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getPoder() {
    return poder;
  }

  public void setPoder(int poder) {
    this.poder = poder;
  }

  @Override
  public String toString() {
    return "Gato{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", poder=" + poder +
            '}';
  }
}
