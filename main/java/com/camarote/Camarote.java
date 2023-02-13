package main.java.com.camarote;

import main.java.com.ingresso.IngressoVip;

public class Camarote extends IngressoVip {
    private int mesa;
    public Camarote(double umValor, double umAdicional, int umaMesa) {
        super(umValor, umAdicional);
        this.mesa = umaMesa;
    }

    public int getMesa() {
        return mesa;
    }
}