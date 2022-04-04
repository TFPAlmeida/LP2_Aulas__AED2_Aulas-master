package edu.ufp.inf.lp2.aulas.tp._02;

public class MyMath {

    public static double pow_iteractive(double base, double exponent){
        double exp=1;
        for (int i = 0; i<exponent; i++) exp*=base;
        return exp;
    }

    public static double pow_recursive(double base, double exponent){

        if(exponent==0) return 1;
        if (base==1) return 0;
        return base*MyMath.pow_recursive(base,exponent-1);
    }

    //Create static methods, for calculating factorial of a number, using
    //different cycles provided by Java

    public static double fact_recursive(double n){

        if(n==0 || n==1)return 1;
        return n*MyMath.fact_recursive(n-1);
    }

    public static double fact_for(int n){
        double total=1;
        for (int i = 1; i <= n; i++) total*=i;
        return total;
    }

    public static double fact_while(int n){
        double total = 1;
        while (n>0){
            total*=n;
            n--;
        }
        return total;
    }

    public static double fact_do_hile(int n){

        double total = 1;

        do {
            total*=n;
            n--;
        }while (n>0);

        return total;
    }

    public static void main(String[] args) {
        System.out.println(fact_for(5));
        System.out.println(fact_recursive(5));
        System.out.println(fact_while(5));
        System.out.println(fact_do_hile(5));
        System.out.println(MyMath.pow_recursive(2,2));
        System.out.println(pow_iteractive(2,2));

    }

}
