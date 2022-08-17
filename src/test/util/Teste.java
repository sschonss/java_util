package test.util;

import br.com.schons.banco.model.Conta;
import br.com.schons.banco.model.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Conta cc = new ContaCorrente(22,11);
        list.add(cc);

        Conta cc2 = new ContaCorrente(33,11);
        list.add(cc2);

        System.out.println("Tamanho: " + list.size());

        Conta ref = (Conta) list.get(0);

        System.out.println(ref.getNumero());

        list.remove(0);

        System.out.println("Tamanho: " + list.size());

        Conta cc3 = new ContaCorrente(42,11);
        list.add(cc3);

        Conta cc4 = new ContaCorrente(65,11);
        list.add(cc4);

        Conta cc5 = new ContaCorrente(65,11);
        list.add(cc5);

        Conta cc6 = new ContaCorrente(65,11);
        list.add(cc6);

        System.out.println("Tamanho: " + list.size());

       //for (int i = 0; i < list.size(); i++) {
       //    Object obj = list.get(i);
       //    System.out.println(obj);
       //}

        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}
