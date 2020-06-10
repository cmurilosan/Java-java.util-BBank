package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];

        String[] nomes = new String[5];

        int idade = 29; //Integer

//        Integer idadeRef = new Integer(29); //Internamente ele está realizando isso conforme acima (WRAPPER)
//        Criamos objetos dessas classes para envolver ou embrulhar uma valor primitivo.

        Integer idadeRef = Integer.valueOf(29); //AUTOBOXING
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);   //Tamanho em BITS
        System.out.println(Integer.BYTES);  //Tamanho em BYTES

        int valor = idadeRef.intValue();    //UNBOXING

        String s = args[0];

//        Integer numero = Integer.valueOf(s);

        int numero = Integer.parseInt(s);

        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);    //Mesmo alterando a variável por 29 o código funciona. Chamado de AUTOBOXING
    }
}
