import main.java.com.camarote.Camarote;
import main.java.com.ingresso.*;

class Main {
  public static void main(String[] args) {
    // criar ingresso
    Ingresso ingresso = new Ingresso(100.0);
    System.out.println("Valor do ingresso: " + ingresso.getValor());

    // criar ingresso com desconto
    Ingresso ingressoComDesconto = new IngressoComDesconto(100.0, 99.0);
    System.out.println("Valor do ingresso com desconto: " + ingressoComDesconto.getValor());

    // criar ingresso vip
    Ingresso ingressoVip = new IngressoVip(100.0, 10.0);
    System.out.println("Valor do ingresso vip: " + ingressoVip.getValor());

    // criar um camarote
    Camarote camarote = new Camarote(100.0, 10.0, 20);
    System.out.println("Valor do camarote: " + camarote.getValor());
    System.out.println("Mesa: " + camarote.getMesa());
  }
}