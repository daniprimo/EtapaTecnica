package Exercicios02;
//
//2. Faça um programa que leia um conjunto de dados contendo o número da
//        matrícula, as três notas e a frequência (número de aulas frequentadas) de
//        cinco alunos. Calcule e mostre: (vale 3 pontos)
//        • Para cada aluno o número da matrícula, a nota final e a mensagem
//        (aprovado ou reprovado);
//        • A maior e a menor nota da turma;
//        • O total de alunos reprovados;
//        • A percentagem de alunos reprovados por frequência abaixo da mínima
//        necessária.

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class AplicacaoConsole {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        int somaReprovadosPorPresenca = 0;

        for (int i = 0;i<5;i++){
            try {
                int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do aluno."));
                double nota01 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota."));
                double nota02 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota."));
                double nota03 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota."));
                String frequenciaPresenca = JOptionPane.showInputDialog("Digite a frequencia. [Alta, Media, Minima");
                alunos.add(new Aluno(matricula, nota01, nota02, nota03, frequenciaPresenca));
            }catch (Exception e){
                System.out.println("Por gentileza digitar as notas com ponto flutuante");
            }

        }

        for (Aluno al : alunos){
            System.out.println("Matricula do Aluno: "+ al.getMatricula());
            double somaTodos = al.getNota01()+al.getNota02()+al.getNota03();
            System.out.println("Media Final: "+ (somaTodos/3));
            if (al.getFrequenciaPresenca() != "Minima"){
                Function<Double,String> status = n -> somaTodos >=7 ? "Aprovado":"Reprovado";
            }else{
                System.out.println("Reprovado por Presenca");
                somaReprovadosPorPresenca++;

            }

        }

        switch (somaReprovadosPorPresenca){
            case 1:
                System.out.println("20% dos alunos reprovado por presenca");
                break;
            case 2:
                System.out.println("40% dos alunos reprovado por presenca");

                break;
            case 3:
                System.out.println("60% dos alunos reprovado por presenca");

                break;
            case 4:
                System.out.println("80% dos alunos reprovado por presenca");

                break;

            case 5:
                System.out.println("100% dos alunos reprovado por presenca");

                break;


        }





    }

}
