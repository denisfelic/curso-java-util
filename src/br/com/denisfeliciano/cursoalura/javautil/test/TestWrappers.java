package br.com.denisfeliciano.cursoalura.javautil.test;

public class TestWrappers {

    public static void main(String[] args) {

        // int -> primitivo,  Integer -> Wrapper
        
        double floatNumber = 23.4;
        Integer interiroOne = (int) floatNumber; // Autoboxing

        System.out.println(interiroOne.intValue()); // Unboxing
        System.out.println(interiroOne.byteValue());
        System.out.println(interiroOne.doubleValue());
        System.out.println(interiroOne.floatValue());
        System.out.println(interiroOne.shortValue());
        System.out.println(Integer.parseInt("99"));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
