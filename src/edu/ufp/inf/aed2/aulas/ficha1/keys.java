package edu.ufp.inf.aed2.aulas.ficha1;
//exercicio2 ficha1
public class keys {

    public keys(int[] keys) {
        this.keys = keys;
    }

    private int[] keys;

    public boolean contains(int key){

        for(int i = 0; i<keys.length; i++){
            if(keys[i] == key){
                return true;
            }
        }
        return false;
    }

    public void delete(int key){
        int x = 0;

        for(int i = 0; i<keys.length; i++){
            if(keys[i] == key){
                x = i;
            }
        }

        for(int i = x; i < keys.length-1; i++){

            keys[i] = keys[i+1];

        }
    }

    public boolean isEmpty(){
        if(keys == null)
            return true;
        else
            return false;
    }



    public int[] getKeys() {
        return keys;
    }

    public void setKeys(int[] keys) {
        this.keys = keys;
    }

    public static void main(String[] args) {
        int keys[] = {1,2,3,4,5,6,7,8,9};
        keys k = new keys(keys);
        k.delete(5);
    }
}
