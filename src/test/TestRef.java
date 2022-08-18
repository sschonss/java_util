import br.com.schons.banco.model.Conta;
import br.com.schons.banco.model.ContaCorrente;
import br.com.schons.banco.model.ContaPoupanca;

public class TestRef {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22,11);
        contas[0] = cc1;

        ContaPoupanca cp1 = new ContaPoupanca(33,11);
        contas[1] = cp1;

        Conta ref = contas[0];
        //System.out.println(ref.getNumero());
        //System.out.println(contas[0].getNumero());

        ContaPoupanca ref2 = (ContaPoupanca) contas[1];//casting
        System.out.println(ref2.getNumero());
        System.out.println(contas[1].getNumero());
        System.out.println(cc1.getNumero());


    }
}
