package Exercicios04;
//
//4. Eu Clecio, preciso cadastrar 6 clientes e verificar se o faturamento da
//        minha loja foi superior a loja do Ubiratan (faturamento = 54000). Se o
//        faturamento atingir esse valor mostre na tela uma mensagem contendo
//        em quanto foi superado o faturamento.

import java.util.ArrayList;

public class Faturamento {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Daniel", 300.00));
        clientes.add(new Cliente("Samanta", 500.00));
        clientes.add(new Cliente("Henrrique", 300.00));
        clientes.add(new Cliente("Saulo", 600.00));
        double soma;
        for(Cliente cliente:clientes){
            soma = cliente.getValorDaCOmpra();

        }

        if (soma <= 5400){
            System.out.println("Faturamento do clecio foi menor que do Ubira");
            System.out.println("DIeferebça de R$"+ (5400-soma));
        }else{
            System.out.println("Faturamento SUperior ao do Ubiratan");
            System.out.println("DIeferebça de R$"+ (soma-5400));
        }

    }

}
