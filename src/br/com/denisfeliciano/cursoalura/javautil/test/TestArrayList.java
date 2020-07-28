package br.com.denisfeliciano.cursoalura.javautil.test;

import br.com.denisfeliciano.cursoalura.javautil.classes.Pessoa;

import java.util.ArrayList;

public class TestArrayList {

    public static void main (String[] args){

        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

        Pessoa pessoinha1 = new Pessoa("José");
        Pessoa pessoinha2 = new Pessoa("Maria");
        Pessoa copiaPessoinha1 = pessoinha1;



        listaDePessoas.add(pessoinha1);
        listaDePessoas.add(pessoinha2);


        System.out.println(listaDePessoas);
        System.out.println(listaDePessoas.contains(copiaPessoinha1));
    }
}
