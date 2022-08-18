import br.com.schons.banco.model.Conta;
import br.com.schons.banco.model.ContaCorrente;
import model.GuardadorDeContas;

public class TestGuardador {
    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(33,11);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQtdContas();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencias(1);
        System.out.println(ref.getNumero());
    }

}
