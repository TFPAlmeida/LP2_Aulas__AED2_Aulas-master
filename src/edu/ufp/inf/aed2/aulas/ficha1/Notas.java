package edu.ufp.inf.aed2.aulas.ficha1;

import java.lang.String;
//exercicio 1 ficha1
public class Notas {
//try catch - importante
//ST
    public Notas(String name, int nota1, int nota2, int nota3) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    private String name;
    private int nota1;
    private int nota2;
    private int nota3;

    public static void media(int nota1, int nota2, int nota3){

        float media = 0;

        media = (nota1 + nota2 + nota3)/3;

        if(media <= 3){
            System.out.println("media = " + media + "fraco");
        }else if( media <= 7){
            System.out.println("media = " + media + "insuficiente");
        }else if(media <= 12){
            System.out.println("media = " + media + " suficiente");
        }else if(media <= 17){
            System.out.println("media = " + media + "bom");
        }else if(media <= 20){
            System.out.println("media = " + media + " muito bom");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public static void main(String[] args) {
        Notas n = new Notas("Tiago", 15,15, 15);
        n.media(n.nota1,n.nota2,n.nota3);
    }
}
