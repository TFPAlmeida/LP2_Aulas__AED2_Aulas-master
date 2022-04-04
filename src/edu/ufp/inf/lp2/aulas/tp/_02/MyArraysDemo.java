package edu.ufp.inf.lp2.aulas.tp._02;

import edu.ufp.inf.lp2.aulas.tp._01_intro.Point;

public class MyArraysDemo {

    public static void testArrayObjects(){
        Point[] arrPoints = new Point[4];

        arrPoints[0] = new Point(0.0F,0.0F);
        arrPoints[1]= new Point(1.1F, 2.2F);

        for (int i = 0; i < arrPoints.length; i++){
            System.out.println("arrPoints[" + i + "]" + " = [" + arrPoints[i].x + ", " + arrPoints[i].y + "]");
        }

    }

    public static void testArrayPrimitives (){
        int[] arrayInts = new int[4];
        arrayInts[0]=10;
        arrayInts[1]=20;
        for (int i = 0; i < arrayInts.length; i++){
            System.out.println("arrayInts[" + i + "]" + " = " + arrayInts[i]);
        }
    }



    public static void main(String[] args){

        testArrayPrimitives();
        testArrayObjects();

    }

}
