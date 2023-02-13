package main.java.com.ingresso;

public class IngressoComDesconto extends Ingresso {
    public IngressoComDesconto(double umValor, double umDesconto) {
        super((umDesconto <= umValor ? umValor - umDesconto : 0.0));
    }
}