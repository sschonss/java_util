package test.util;

import br.com.schons.banco.model.Conta;
import br.com.schons.banco.model.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList();

        Conta cc = new ContaCorrente(22,41);
        list.add(cc);

        Conta cc2 = new ContaCorrente(33,45);
        list.add(cc2);

        System.out.println("Tamanho: " + list.size());

        Conta ref = list.get(0);

        System.out.println(ref.getNumero());

        list.remove(0);

        System.out.println("Tamanho: " + list.size());

        Conta cc3 = new ContaCorrente(42,23);
        list.add(cc3);

        Conta cc4 = new ContaCorrente(65,43);
        list.add(cc4);

        Conta cc5 = new ContaCorrente(65,12);
        list.add(cc5);

        Conta cc6 = new ContaCorrente(65,11);
        list.add(cc6);

        System.out.println("Tamanho: " + list.size());

        System.out.println("----------------------------------------------------");

        for(Conta obj : list) {
            System.out.println(obj.getNumero());
        }
    }
}
