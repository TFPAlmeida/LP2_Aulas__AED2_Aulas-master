package edu.ufp.inf.aed2.aulas.ficha4;

import edu.princeton.cs.algs4.StdIn;

public class exercise_11 {

   /* private static int exercise_11() {


        final Double x;
        final Double y;

        public int hashCode() {
            int hash = 17;
            hash = 31 * hash + x.hashCode();
            hash = 31 * hash + y.hashCode();
            return hash;
        }
    }

    private static void exercise_12(){
        SeperateChainingHashST<String, Integer> st = new SeperateChainingHashST<>();

        st.put("SolDeInverno",1);
        st.put("LuaColorida",1);
        st.put("MundoRedondo",1);

        System.out.println("Insert your password:");

        boolean valid = false;

        while(!valid){

            String pass = StdIn.readString();

            if(isPassValid(st, pass)){
                valid = true;
            }
        }
        System.out.println("Your password is valid!");
    }

    private static boolean isPassValid(SeparatedChainingHashST<String, Integer> st, String password){

        if(password == null || password.length() == 0){
            System.out.println("Password is null or empty");
            return false;
        }

        if(password.length() < 8) {
            System.out.println("Password " + password + "is less than 8 characters");
            return false;
        }

        if(st.get(password) != null){
            System.out.println("Password " + password + "is present in the list");
            return false;
        }

        Iterable<String> keys = st.keys();

        for(String key : keys){
            if(password.contains(key)){
                if(password.matches(regex: ".*\\d")){
                    System.out.println("Password " + password + " is present in the list and");
                    return false;
                }
            }
        }
    }*/
}

