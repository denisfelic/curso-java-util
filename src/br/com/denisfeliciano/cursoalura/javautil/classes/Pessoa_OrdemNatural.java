package br.com.denisfeliciano.cursoalura.javautil.classes;

import org.jetbrains.annotations.NotNull;

public class Pessoa_OrdemNatural  extends  Pessoa implements Comparable<Pessoa>{

    public Pessoa_OrdemNatural(String nome) {
        super(nome);
    }

    public Pessoa_OrdemNatural(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public int compareTo(@NotNull Pessoa pessoa) {

        return Integer.compare(this.getIdade(), pessoa.getIdade());
    }
}
