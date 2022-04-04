package edu.ufp.inf.lp2.aulas.tp._01_intro;

public class Main {

    public static void main(String[] args) {
    /*Primitivos
     Lógicos: boolean  b-true or b-false
     Textuais: char c='A'
               String s = "ola"
     Inteiros: byte b1=5   entre 0 a 255
               short 16 bits
               int 32 bits
               long 64 bits
     Virgula Flutuante: float 32
                        double 64
    Boxing:Guardar um primitivo dentro de um objeto   Integer i = new Integer(10); pe.
     */

        String str = "abracadabra";

        int vowelsCount=0;
        // your code here
        for(int i = 0; i<str.length();i++)

            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowelsCount++;
            }


    }

}
