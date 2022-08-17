package model;

import br.com.schons.banco.model.Conta;

public class GuardadorDeContas {
    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta conta) {
        this.referencias[this.posicaoLivre] = conta;
        this.posicaoLivre++;
    }

    public int getQtdContas() {
        return this.posicaoLivre;
    }

    public Conta getReferencias (int pos) {
        return this.referencias[pos];
    }
}
