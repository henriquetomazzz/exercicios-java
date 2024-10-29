package poo.atividade02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número do tipo double: ");
        double numero = scanner.nextDouble();

        int numInt = (int) numero;
        long numLong = (long) numero;
        float numFloat = (float) numero;
        byte numByte = (byte) numero;

        System.out.println("O número int ficará: " + numInt);
        System.out.println("O número long ficará: " + numLong);
        System.out.println("O número flutuante ficará: " + numFloat);
        System.out.println("O número byte ficára: " + numByte);
    }
}
