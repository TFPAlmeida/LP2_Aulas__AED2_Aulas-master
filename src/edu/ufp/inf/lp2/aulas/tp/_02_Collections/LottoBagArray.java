package edu.ufp.inf.lp2.aulas.tp._02_Collections;

import java.util.ArrayList;
import java.util.Random;

public class LottoBagArray {

    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 90;
    private int[] bagInts = new int [MAX_NUM];
    private int numberRemaningBalls;
    private final Random rand = new Random();

    public int getnumberRemaningBalls() {
        return numberRemaningBalls;
    }

    public LottoBagArray(){
        rand.setSeed(System.currentTimeMillis());//numero de milisegundos
        for(int i = 0; i < bagInts.length; i++){
            while(!addLottoNumber(rand.nextInt(MAX_NUM)+MAX_NUM)){
                continue;
            }
        }
    }

    public boolean addLottoNumber(int n){
        if(!containsLottoNumber(n)){
            this.bagInts[this.numberRemaningBalls++] = n;
            return true;
        }
        return false;
    }

    public boolean containsLottoNumber(int n){
        //foreach
        for(int i : bagInts) {
            if (i == n)
                return true;
        }
        return false;
    }

    public int removeLottoNumberRandomly(){
        int index = rand.nextInt(this.numberRemaningBalls);
        return removeLottoNumberAtIndex(index);
    }

    public int removeLottoNumberAtIndex(int index){
        if(index >= 0 && index < numberRemaningBalls){
            int element = bagInts[index];
            for(int i = index; i < numberRemaningBalls - 1; i++){
                this.bagInts[i] = this.bagInts[i+ 1];
            }
            bagInts[numberRemaningBalls-1] = 0;
            numberRemaningBalls--;
            return element;
        }
        return -1;
    }

    public ArrayList<Integer>toIntigerArrayList(){
        ArrayList<Integer> aux = new ArrayList(numberRemaningBalls);
        for(int i = 0; i < numberRemaningBalls; i++){
            aux.add(bagInts[i]);
        }
        return aux;
    }

    public static void main(String[] args) {
        LottoBagArray lottoBagArray = new LottoBagArray();
    }
}
