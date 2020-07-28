package br.com.denisfeliciano.cursoalura.javautil.test;

import java.util.Arrays;

public class OrdenandoArraySimples {

    public static void main(String[] args) {

        int[] listaNumeros = {1,23,4,3,31,543,87,2,-3,213};

        for(int num : listaNumeros){
            System.out.println(num);
        }

        System.out.println("-----Ordenado--------");

        Arrays.sort(listaNumeros);
        for(int num: listaNumeros){
            System.out.println(num);
        }
    }
}
