package model;

public class GuardadorObj {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorObj() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object obj) {
        this.referencias[this.posicaoLivre] = obj;
        this.posicaoLivre++;
    }

    public int getQtdObj() {
        return this.posicaoLivre;
    }

    public Object getReferencias (int pos) {
        return this.referencias[pos];
    }
}
