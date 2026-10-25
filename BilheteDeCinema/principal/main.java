package Avaliacao2.BilheteDeCinema.principal;

import Avaliacao2.BilheteDeCinema.entidades.Ingresso;
import Avaliacao2.BilheteDeCinema.entidades.IngressoEstudante;
import Avaliacao2.BilheteDeCinema.entidades.IngressoVIP;

public class main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(40);
        Ingresso ingresso2 = new Ingresso(40);
        IngressoVIP vip = new IngressoVIP(40);
        IngressoEstudante estudante = new IngressoEstudante(40);

        Ingresso[] vetor = {ingresso, ingresso2, vip, estudante};

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].calcularValorFinal();

        }

        System.out.printf("Faturamento da sessão: R$ %.2f\n",soma);
    }
}
