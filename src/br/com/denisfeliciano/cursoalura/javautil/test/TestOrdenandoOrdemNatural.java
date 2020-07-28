package br.com.denisfeliciano.cursoalura.javautil.test;

import br.com.denisfeliciano.cursoalura.javautil.classes.Pessoa;
import br.com.denisfeliciano.cursoalura.javautil.classes.Pessoa_OrdemNatural;

import java.util.ArrayList;
import java.util.Collections;

public class TestOrdenandoOrdemNatural {

    public static void main(String[] args) {

        Pessoa_OrdemNatural p1 = new Pessoa_OrdemNatural("Denis", 23);
        Pessoa_OrdemNatural p2 = new Pessoa_OrdemNatural("Thais", 17);
        Pessoa_OrdemNatural p3 = new Pessoa_OrdemNatural("Kelvyn", 16);
        Pessoa_OrdemNatural p4 = new Pessoa_OrdemNatural("Lucas", 19);

        ArrayList<Pessoa_OrdemNatural> listaPessoas = new ArrayList<>();
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
        listaPessoas.add(p4);

        for (Pessoa pess : listaPessoas) {
            System.out.println(pess);
        }

        System.out.println("--------------");

        Collections.sort(listaPessoas);
        for (Pessoa pess : listaPessoas){
            System.out.println(pess);
        }

        System.out.println("-----------------");
        Collections.reverse(listaPessoas);
        for (Pessoa pess : listaPessoas){
            System.out.println(pess);
        }

        System.out.println("--------------");
        // Neste caso, ele utilizará o Comparator padrão da classe
        listaPessoas.sort(null);
        for (Pessoa pess : listaPessoas){
            System.out.println(pess);
        }

        System.out.println("----- Rotacionando-------");
        Collections.rotate(listaPessoas, 3);
        for (Pessoa pess : listaPessoas){
            System.out.println(pess);
        }

        System.out.println("-----Embaralhando--------");
        Collections.shuffle(listaPessoas);
        for (Pessoa pess : listaPessoas){
            System.out.println(pess);
        }


    }
}
