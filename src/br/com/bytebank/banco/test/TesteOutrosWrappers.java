package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = 3.2;  //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number reNumero = Integer.valueOf(29);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);
    }
}
