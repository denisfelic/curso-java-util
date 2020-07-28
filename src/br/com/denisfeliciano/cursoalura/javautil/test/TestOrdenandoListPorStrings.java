package br.com.denisfeliciano.cursoalura.javautil.test;

import br.com.denisfeliciano.cursoalura.javautil.classes.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;

public class TestOrdenandoListPorStrings {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Denis");
        Pessoa p2 = new Pessoa("Aline");
        Pessoa p3 = new Pessoa("Camila");
        Pessoa p4 = new Pessoa("Kayque");
        Pessoa p5 = new Pessoa("Lucas");

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        System.out.println(p2.getNome().compareTo(p5.getNome()));
        System.out.println("----------------------------");

        for (Pessoa pess : pessoas) {
            System.out.println(pess.getNome());
        }
        System.out.println("----------------------------");

        pessoas.sort(new OrdenaPessoasPorNomeComparator());

        for (Pessoa pess : pessoas) {
            System.out.println(pess.getNome());
        }

    }

}

class OrdenaPessoasPorNomeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa, Pessoa pessoa2) {
        String nomeP1 = pessoa.getNome();
        String nomeP2 = pessoa2.getNome();
        return nomeP1.compareTo(nomeP2);
    }


}
