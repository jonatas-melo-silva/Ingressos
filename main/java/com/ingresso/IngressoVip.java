package main.java.com.ingresso;

public class IngressoVip extends Ingresso {
    public IngressoVip(double umValor, double umValorAdicional) {
        super(umValor + umValorAdicional);
    }
}