package Exercicios02;

//Faça um programa que leia um conjunto de dados contendo o número da
//        matrícula, as três notas e a frequência (número de aulas frequentadas) de
//        cinco alunos. Calcule e mostre: (vale 3 pontos)

public class Aluno {
        private int matricula;
        private double nota01;
        private double nota02;
        private double nota03;
        private String frequenciaPresenca;

    public Aluno(Aluno aluno) {
    }


    public Aluno(int matricula, double nota01, double nota02, double nota03, String frequenciaPresenca) {
        this.matricula = matricula;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.frequenciaPresenca = frequenciaPresenca;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getNota03() {
        return nota03;
    }

    public void setNota03(double nota03) {
        this.nota03 = nota03;
    }

    public String getFrequenciaPresenca() {
        return frequenciaPresenca;
    }

    public void setFrequenciaPresenca(String frequenciaPresenca) {
        this.frequenciaPresenca = frequenciaPresenca;
    }
}
