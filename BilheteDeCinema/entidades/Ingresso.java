package Avaliacao2.BilheteDeCinema.entidades;

public class Ingresso {
    protected double valorPadrao;

    public Ingresso(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }

    public double calcularValorFinal() {
        return valorPadrao;
    }

    public double getValorPadrao() {
        return valorPadrao;
    }

    public void setValorPadrao(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }
}
