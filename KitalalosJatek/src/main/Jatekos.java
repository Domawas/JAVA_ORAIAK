
package main;

import java.util.Random;



public class Jatekos {
    private static final Random random = new Random();
    /*Adatrejtés: private*/
    private int tipp;

    
    /*Minden adattagot */
    public Jatekos() {
        this.tipp = Jatek.MIN;
    }
    
    
    
    
    /*GETTER lekérdező, minden privát adattagra*/
    public int getTipp(){
        return tipp;
    }
    /*SETTER: beállító ha változhat az adattag*/
    //void setTipp()
    
    public void tippel(){
        
        this.tipp = random.nextInt(Jatek.MIN, Jatek.MAX);
        System.out.println("tippelésem: " + this.tipp);
    }
}
