package Exercicios01;

import javax.swing.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TresValores {
    public static void main(String[] args) {
        Set<Integer> numeros = new LinkedHashSet<>();

        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o 1° valor")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o 2° valor")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o 3° valor")));

        System.out.println("Numeros na ordem de inserção: ");
        System.out.println(numeros.toString());

        System.out.println("Numeros na ordem natural: ");
        Set<Integer> numeros2 = new TreeSet<>(numeros);
        System.out.println(numeros2);




    }
}
