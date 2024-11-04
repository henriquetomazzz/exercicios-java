package main.java.poo.atividade04;

import java.time.LocalDateTime;

public class Postagem {
    private String text;
    private LocalDateTime date;
    private String autor;
    private int likes;

    public Postagem(String text, LocalDateTime date, String autor){
        this.text = text;
        this.date = date;
        this.autor = autor;
        this.likes = 0;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public void setDate(LocalDateTime date){
        this.date = date;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getlikes(){
        return likes;
    }

    public void like(){
        likes++;
    }

    public void dislike(){
        if (likes > 0){
            likes--;
        }
    }
    public String toString(){
        return "Postagem{" +
                "texto='" + text + '\''+
                ", data=" + date +
                ", autor='" + autor + '\'' +
                ", curtidas=" + likes +
                '}';
    }
}
