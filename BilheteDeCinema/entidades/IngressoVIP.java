package Avaliacao2.BilheteDeCinema.entidades;

public class IngressoVIP extends Ingresso {

    public IngressoVIP(double valorPadrao) {
        super(valorPadrao);
    }

    @Override
    public double calcularValorFinal() {
        return valorPadrao += 20;
    }
}
