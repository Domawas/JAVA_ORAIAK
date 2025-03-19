
package main;

public class Vevo {
    private double penz; 

    
    public Vevo(double penz) {
        this.penz = penz;
    }

   
    public void feltolt(double osszeg) {
        penz += osszeg;
    }


    public double getPenz() {
        return penz;
    }

 
    public void vasarlas(ItalAutomata automata) {
        double visszajaro = automata.vasarlas((int) penz);
        if (visszajaro >= 0) {
            penz -= automata.getAr();  
            System.out.println("Vásárlás sikeres! Visszajáró: " + visszajaro + " Ft.");
        } else {
            System.out.println("A vásárlás nem sikerült.");
        }
    }
}
