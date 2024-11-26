package main.java.poo.atividade06.q2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> resultado = numeros.stream()
                .filter(e -> e%2 == 0)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
