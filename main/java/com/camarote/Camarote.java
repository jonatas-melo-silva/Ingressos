package main.java.com.camarote;

public class Camarote extends IngressoVip {
    private int mesa;
    public Camarote(doble umValor, double umAdicional, int umaMesa) {
        super(umValor, umAdicional);
        this.mesa = umaMesa;
    }

    public int getMesa() {
        return mesa;
    }
}