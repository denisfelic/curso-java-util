package br.com.denisfeliciano.cursoalura.javautil.test;

import br.com.denisfeliciano.cursoalura.javautil.classes.Pessoa;

import java.util.ArrayList;

public class TestObject {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("José");
        Pessoa pessoa2 = new Pessoa("José");

        System.out.println("Pessoa 1, é igual a pessoa 2? "+ pessoa1.equals(pessoa2));

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1);
        boolean existe = listaPessoas.contains(pessoa2);
        System.out.println("Lista contem? "+ existe);
    }
}
