package edu.ufp.inf.aed2.aulas.ficha0;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.SequentialSearchST;
import edu.princeton.cs.algs4.StdOut;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Aula1 {
    public static void main(String[] args) {

        System.out.println("Exemplo fornecido com AED2");
        //exercicio1();
        //exercicio2();
        exercicio3();

    }

    public static void exercicio1() {

        File myObj = new File("C:\\Users\\tiago\\IdeaProjects\\LP2_Aulas__AED2_Aulas\\data\\8ints.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

        try {
            File myObj1 = new File("C:\\Users\\tiago\\IdeaProjects\\LP2_Aulas__AED2_Aulas\\data\\8ints.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void exercicio2(){
        In in = new In(".//data//30ints.txt");
        String linha;
        int contar = 0;
        while (in.hasNextLine()) {
            linha = in.readLine();
            System.out.println(linha);
            contar++;
        }
        System.out.println("\nN=" + contar);
    }

    public static void exercicio3(){
        File myObj = new File("C:\\Users\\tiago\\IdeaProjects\\LP2_Aulas__AED2_Aulas\\data\\8ints.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

        In in = new In(".//data//8ints.txt");
        String linha;
        int contar = 0;
        while (in.hasNextLine()) {
            linha = in.readLine();
            System.out.println(linha);
            contar++;
        }
        System.out.println("\nN=" + contar);
    }

    public static void exercicio1_4(int size){
        int[] output = new int[size];
    }
}