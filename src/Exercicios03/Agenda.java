package Exercicios03;
//3. Crie uma agenda que armazena, código da pessoa, número do telefone,
//        idade. Sua agenda deve possibilitar: (vale 3 pontos)
//        (1) – inserir um contato
//        (2) – Remover um contato
//        (3) – Editar um


import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Agenda {
    public static void main(String[] args) {
        Map<Integer, Pessoa> agenda = new HashMap<>();
        int opcao = 0;

        boolean rep = true;
        while(rep)
        System.out.println("[1] - Inserir um contato");
        System.out.println("[2] - Remover o Contato");
        System.out.println("[3] - Editar Contato");
        System.out.println("[4] - Mostra Todos");
        System.out.println("[5] - sair");
        switch (opcao){
            case 1:
                int i = Integer.parseInt(JOptionPane.showInputDialog("Digiteo codigo"));
                String nome = JOptionPane.showInputDialog("Digite o nome:");
                String telefone = JOptionPane.showInputDialog("Digite o telefone");
                 int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
                agenda.put(i,new Pessoa(nome,telefone,idade));

                break;
            case 2:
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo de quem deseja remover"));
                Iterator<Pessoa> iterator1 = agenda.values().iterator(); ;
                while (iterator1.hasNext()) {
                    if (iterator1.next().getCodigo() == codigo) iterator1.remove();
                }

                break;
            case 3:

                break;
            case 5:
                rep = false;
                break;

        }


    }
}
