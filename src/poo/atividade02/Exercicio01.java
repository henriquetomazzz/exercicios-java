package poo.atividade02;

public class Exercicio01 {

    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 200;
        Integer num4 = 200;
        System.out.println(num1 == num2); //Retorna True
        System.out.println(num3 == num4); //Retorna False
        System.out.println(num2.equals(num3)); //Retorna True
    }
}
/*
 * Quando se é utilizado INTEGER ele não vai criar um valor inteiro, e sim um objeto inteiro
 * que irá utilizar um espaço da memória, logo num3 e num4 foram alocados em espaços diferentes
 * da memória e quando comparados irá retornar falso. Assim, o EQUALS vai comparar o valor do
 * objeto.
 */
