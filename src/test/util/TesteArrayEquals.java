package test.util;

import br.com.schons.banco.model.Conta;
import br.com.schons.banco.model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayEquals {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,41);
        list.add(cc);

        Conta cc2 = new ContaCorrente(33,45);
        list.add(cc2);

        Conta cc3 = new ContaCorrente(22,41);
        list.add(cc3);

        boolean existe = list.contains(cc3);

        System.out.println("Ja existe? " + existe);


        for(Conta conta : list){
            if (conta.equals(cc3)){
                System.out.println("Conta encontrada!");
            }
        }

        for(Conta obj : list) {
            System.out.println(obj.getNumero());
        }
    }
}
