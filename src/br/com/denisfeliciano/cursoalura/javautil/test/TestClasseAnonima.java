package br.com.denisfeliciano.cursoalura.javautil.test;

import br.com.denisfeliciano.cursoalura.javautil.classes.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;

public class TestClasseAnonima {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Denis");
        Pessoa p2 = new Pessoa("Aline");
        Pessoa p3 = new Pessoa("Camila");
        Pessoa p4 = new Pessoa("Kayque");
        Pessoa p5 = new Pessoa("Lucas");

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        System.out.println("---------Antes--------------");

        for (Pessoa pess : pessoas) {
            System.out.println(pess.getNome());
        }


        // Classe anônima
        pessoas.sort(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa, Pessoa pessoa2) {
                return pessoa.getNome().compareTo(pessoa2.getNome());
            }
        });

        System.out.println("-------------Ordenado---------------");

        for (Pessoa pess : pessoas) {
            System.out.println(pess.getNome());
        }

    }
}

class TestComLambdas{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Denis");
        Pessoa p2 = new Pessoa("Aline");
        Pessoa p3 = new Pessoa("Camila");
        Pessoa p4 = new Pessoa("Kayque");
        Pessoa p5 = new Pessoa("Lucas");

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        System.out.println("---------Antes--------------");

        for (Pessoa pess : pessoas) {
            System.out.println(pess.getNome());
        }


        // Função anônima
        pessoas.sort((Pessoa pessoa, Pessoa pessoa2) ->
                pessoa.getNome().compareTo(pessoa2.getNome())
        );

//        pessoas.sort((Pessoa pessoa, Pessoa pessoa2) -> {
//                return pessoa.getNome().compareTo(pessoa2.getNome());
//            });

        System.out.println("-------------Ordenado---------------");

        for (Pessoa pess : pessoas) {
            System.out.println(pess.getNome());
        }


        // foreach com lambda
        System.out.println("-------------------");
        ArrayList<Pessoa> arrPessoas2 = new ArrayList<>();
        pessoas.forEach(pess -> {
            System.out.println("Oi " + pess.getNome());
            arrPessoas2.add(pess);
        });

        System.out.println("Array iterado: "+arrPessoas2);

    }
}