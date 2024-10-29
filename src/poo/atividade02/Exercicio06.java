package poo.atividade02;

public class Exercicio06 {
    public static boolean comparar(int[] array1, int[] array2) {
        Integer somaArray1 = soma(array1);
        Integer somaArray2 = soma(array2);

    return somaArray1.equals(somaArray2);
}
    private static Integer soma(int[] array){
        Integer somaTot = 0;
        for (int numero : array) {
            somaTot += numero;
        }
        return somaTot;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {15};

        boolean resultado = comparar(array1, array2);

        System.out.println("A soma dos Arrays é igual? " + resultado);
    }
}
