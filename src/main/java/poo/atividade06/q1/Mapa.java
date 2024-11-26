package main.java.poo.atividade06.q1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapa {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> resultado = numeros.stream()
                .map(e -> e * e)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
