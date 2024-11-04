package main.java.poo.atividade02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String binario = Integer.toBinaryString(numero);
        String octal = Integer.toOctalString(numero);
        String hex = Integer.toHexString(numero);

        System.out.println("Valor em BINÁRIO: " + binario);
        System.out.println("Valor em OCTAL: " + octal);
        System.out.println("Valor em HEXADECIMAL: " + hex);
    }
}
