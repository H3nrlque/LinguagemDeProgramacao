package Avaliacao2.SistemaDeBanco.Principal;

import Avaliacao2.SistemaDeBanco.entidades.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca =  new ContaPoupanca("Henrique", 5);
        contaPoupanca.depositar(1000);
        contaPoupanca.aplicarRendimento();
        contaPoupanca.exibirSaldo();
    }
}
