package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

//        Conta cc1 = new ContaCorrente(22,11);
//        Conta cc2 = new ContaCorrente(22,22);
//        Conta cc3 = new ContaCorrente(22,22);
//
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println("CC1 é igual a CC2? " + igual);
//
//        boolean igual2 = cc2.ehIgual(cc3);
//        System.out.println("CC2 é igual a CC3? " + igual2);

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        ContaCorrente cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

//        boolean existe = lista.contains(cc2);
        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
