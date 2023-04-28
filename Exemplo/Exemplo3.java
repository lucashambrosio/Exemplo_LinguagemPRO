package Exemplo;

import javax.swing.*;

import static Exemplo.Exemplo1.divide;

public class Exemplo3 {
    public static void main (String args []) {
        int dividendo,divisor;
        while (true) {
            try {
                dividendo= Integer.parseInt((JOptionPane.showInputDialog("Digite o dividendo")));
                divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor"));
                divide(dividendo,divisor);
                break;
            } catch (ArithmeticException e1) {
                JOptionPane.showInputDialog(null,"Não pode dividir por zero!");

            }catch (NumberFormatException e2) {
                JOptionPane.showInputDialog(null, "Favor informar apenas numeros inteiros!");
            }


        }

    }
}
