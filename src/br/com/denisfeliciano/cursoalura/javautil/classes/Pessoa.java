package br.com.denisfeliciano.cursoalura.javautil.classes;

import java.util.Objects;

public class Pessoa {

    private final String nome;
    private int  idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean equals(Object objectPessoa) {
        if (this == objectPessoa) return true;
        if (objectPessoa == null || getClass() != objectPessoa.getClass()) return false;
        Pessoa pessoaToBeCompared = (Pessoa) objectPessoa;
        return Objects.equals(nome, pessoaToBeCompared.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return nome + " "+ idade;
    }
}
