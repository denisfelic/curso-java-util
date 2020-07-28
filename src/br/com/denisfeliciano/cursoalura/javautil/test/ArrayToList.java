package br.com.denisfeliciano.cursoalura.javautil.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {

        List<String> argsList = Arrays.asList(args);

        System.out.println(argsList);

        String[] testList = {"OI", "!@#"};
        TestCollection.main(testList);
    }
}

 class TestCollection {
     public static void main(String[] args) {
         System.out.println("Classe filha");
         System.out.println(Arrays.toString(args));


         Collection<Integer> testColleciton = new ArrayList<Integer>();
         testColleciton.add(21);    // Autoboxing - Transformação de primitivo, int  para objeto Integer por exemplo.
         testColleciton.add(23);
         testColleciton.add(24);
         System.out.println(testColleciton.toString());
         Integer age = 24;
         Double weight = 23.3;
         Float piNumber = 3.1415f;
         int ageIntPrimitve = 24;
         Integer testInt = Integer.valueOf(2);



     }
}
