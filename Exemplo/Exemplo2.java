package Exemplo;

public class Exemplo2 {
    public static void main (String args []) {
        try {
            int dividendo = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            divide(dividendo, divisor);
        } catch (ArithmeticException e1) {
            System.out.println("Não pode dividir por zeo!");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Favor informar dois numeros!");
        }
    }

    public static void divide (int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo/divisor));
    }
}
