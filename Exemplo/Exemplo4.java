package Exemplo;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Exemplo4 {
    public static void main (String args[]) {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("a:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("b:"));
            System.out.println("Divisão = " + (a/b));
            System.out.println("Multiplicação = " + (a*b));
            System.out.println("Soma = " + (a+b));
            System.out.println("Subtração = " + (a-b));
        }catch (ArithmeticException e1) {
            System.out.println("Não pode dividir por zero!");
        }catch (NumberFormatException e2) {
            System.out.println("Digite um numero valido!");
        }
        System.out.println("Fim do programa.");
    }
}
