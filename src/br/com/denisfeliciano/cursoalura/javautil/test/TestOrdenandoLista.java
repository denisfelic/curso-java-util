package br.com.denisfeliciano.cursoalura.javautil.test;

import br.com.denisfeliciano.cursoalura.javautil.classes.Pessoa;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestOrdenandoLista {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Downsson", 23);
        Pessoa p2 = new Pessoa("Carlos", 15);
        Pessoa p3 = new Pessoa("Miguel", 49);
        Pessoa p4 = new Pessoa("Eloá", 32);

        ArrayList<Pessoa> pessoas = new ArrayList();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);


        // Antes da ordenação
        for (Pessoa pes : pessoas) {
            System.out.println(pes);
        }

        pessoas.sort(new IdadePessoaComparator());
        // Collections.sort(pessoas, new IdadePessoaComparator());  Legado, não se utiliza mais dessa forma.
        // Depois...

        System.out.println("----------------");
        for (Pessoa pes : pessoas) {
            System.out.println(pes);
        }
    }
}

class IdadePessoaComparator implements Comparator<Pessoa> {

    @Override
    public int compare(@NotNull Pessoa pessoa, @NotNull Pessoa p2) {

        return Integer.compare(pessoa.getIdade(), p2.getIdade());

        // Irá retornar negativo, positivo ou zero...
//        return pessoa.getIdade() - p2.getIdade();
//          ou
//        if(pessoa.getIdade() < p2.getIdade()){
//            return -1;
//        }
//        if(pessoa.getIdade() > p2.getIdade()){
//            return 1;
//        }
//        return 0;
    }
}