package poo.atividade01.exercicio02;

public class Calculadora {

    public static int somar(int... valores) {
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma;
    }

    public static int subtrair(int... valores) {
        int subtracao = 0;

        for (int i = 0; i < valores.length; i++) {
            subtracao -= valores[i];
        }
        return subtracao;
    }

    public static void main(String[] args) {
        System.out.println("Resultado da Soma: " + Calculadora.somar(1, 2, 4, 8));
        System.out.println("Resultado da Subtração: " + Calculadora.subtrair(1,2));
    }
}
