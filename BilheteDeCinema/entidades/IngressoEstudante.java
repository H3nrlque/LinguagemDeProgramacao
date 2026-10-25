package Avaliacao2.BilheteDeCinema.entidades;

public class IngressoEstudante extends Ingresso {

    public IngressoEstudante(double valorPadrao) {
        super(valorPadrao);
    }

    @Override
    public double calcularValorFinal() {
        return valorPadrao -= (valorPadrao * 0.5);
    }
}
