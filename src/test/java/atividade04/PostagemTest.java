package java.atividade04;

import main.java.poo.atividade04.Postagem;

import java.time.LocalDateTime;

public class PostagemTest {
    public static void main(String[] args){
        Postagem postagem = new Postagem("Olá, mundo!", LocalDateTime.now(), "Henrique");

        System.out.println("Postagem original: ");
        System.out.println(postagem);

        postagem.setText("Olá, mundo!");
        System.out.println("\nApós alterar o texto:");
        System.out.println(postagem);

        postagem.like();
        postagem.like();
        System.out.println("\nApós curtir a postagem uma vez:");
        System.out.println("Números de curtidas" + postagem.getlikes());

        postagem.dislike();
        System.out.println("\nApoś discurtir a postagem uma vez:");
        System.out.println("Números de curtidas" + postagem.getlikes());

        postagem.dislike();
        postagem.dislike();
        System.out.println("\nApós tentar descurtir duas vezes quando as curtidas já são 0:");
        System.out.println("Número de curtidas: " + postagem.getlikes());
    }
}
