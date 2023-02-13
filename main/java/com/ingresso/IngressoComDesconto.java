package main.java.com.ingresso;

public class IngressoComDesconto extends Ingresso {
    public IngressoComDesconto(double umValor, double umDesconto) {
        super((umValor - umDesconto <= umValor ? umValor - umDesconto : umValor));
    }
}