package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteArrayList {

    public static void main(String[] args) {

//        List<Conta> lista = new ArrayList<Conta>();
//        LinkedList<Conta> lista = new LinkedList<Conta>();    //Totalmente encadeada
//        ArrayList<Conta> nomes = new ArrayList<Conta>();

        List<Conta> lista = new Vector<Conta>();    //Thread Safe

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(0);

        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33,311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33,322);
        lista.add(cc4);

        System.out.println("Metodo FOR tradicional");
        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("---------------------------------------------------");

        System.out.println("Metodo FOREACH - tem a mesma funçaõ do tradicional, porém, mais utilizado");
        for (Conta conta:lista) {
            System.out.println(conta);

        }
    }
}
