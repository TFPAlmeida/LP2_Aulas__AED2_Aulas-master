package edu.ufp.inf.lp2.aulas.tp._02_Collections;

import java.util.ArrayList;
import java.util.Random;

public class LottoBagArrayList {
                                                /**acabar em casa**/
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 90;
    private ArrayList<Integer> bagInts = new ArrayList<>(MAX_NUM);
    private final Random rand = new Random();


    public LottoBagArrayList(){
        rand.setSeed(System.currentTimeMillis());//numero de milisegundos
        for(int i = 0; i < bagInts.size(); i++){
            while(!addLottoNumber(rand.nextInt(MAX_NUM)+MAX_NUM)){
                continue;
            }
        }
    }

    public int removeLottoNumberRandomly(){
        int index = rand.nextInt(bagInts.size());
        return removeLottoNumberAtIndex(index);
    }

    public int removeLottoNumberAtIndex(int index){
        if(index >= 0 && index < bagInts.size()){
            return this.bagInts.remove(index);
        }
        return -1;
    }

    public boolean addLottoNumber(int n){
        if(!containsLottoNumber(n)){
             this.bagInts.add(n);
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

    public int[] toIntArray(){
        int[] ia = new int[bagInts.size()];
        for(int i = 0; i < bagInts.size(); i++){
            ia[i]= this.bagInts.get(i);
        }
        return ia;
    }

    public static void main(String[] args) {

    }
}
