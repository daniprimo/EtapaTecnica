package Exercicios04;

public class Cliente {
    private String nome;
    private double valorDaCOmpra;

    public Cliente(String nome, double valorDaCOmpra) {
        this.nome = nome;
        this.valorDaCOmpra = valorDaCOmpra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDaCOmpra() {
        return valorDaCOmpra;
    }

    public void setValorDaCOmpra(double valorDaCOmpra) {
        this.valorDaCOmpra = valorDaCOmpra;
    }
}
