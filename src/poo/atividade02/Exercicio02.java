package poo.atividade02;

public class Exercicio02 {
    public static void main(String[] args) {
    Integer num1 = 128;
    Integer num2 = 128;
    System.out.println(num1 == num2);
    }
}
/*
 * Os valores num1 e num2 vão retornar false devido eles execederem o valor de -128 a 127, assim,
 * vão ser alocados em espaços diferentes na memória, assim não vão ocupar o mesmo espaço e não
 * terá o mesmo endereçamento.
 */
