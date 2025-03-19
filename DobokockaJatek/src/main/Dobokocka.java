
package main;

import java.util.Random;


public class Dobokocka {
   
    
    private static final Random RND = new Random();
    private int oldal;  
    private int ertek;  

    //A konstruktor minden adattagot állítson be!!!!!!
    public Dobokocka(int oldal) {
        
        this.oldal = oldal;
        dobas();
    }

 
    void dobas() {
        
        this.ertek = RND.nextInt(oldal) + 1;
    }

  
    public int getOldal() {
        return oldal;
    }

   
    public int getErtek() {
        return ertek;
    }
}

