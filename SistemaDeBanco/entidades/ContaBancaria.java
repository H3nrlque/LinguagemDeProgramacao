package Avaliacao2.SistemaDeBanco.entidades;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void exibirSaldo() {
        System.out.print(STR."Nome do titular: \{this.titular}\n");
        System.out.printf("Saldo atual: %.2f", saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
