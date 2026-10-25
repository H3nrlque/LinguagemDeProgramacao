package Avaliacao2.SistemaDeBanco.entidades;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;


    public ContaPoupanca(String titular, double taxa) {
        super(titular);
        this.taxaRendimento = taxa;
    }

    public void aplicarRendimento() {
        saldo += saldo * (taxaRendimento / 100);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
