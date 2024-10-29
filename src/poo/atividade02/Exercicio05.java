package poo.atividade02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num2 = scanner.nextInt();

        Integer numero1 = num1;
        Integer numero2 = num2;

        System.out.println(num1 == num2);
        System.out.println(numero1.equals(numero2));
    }
}
