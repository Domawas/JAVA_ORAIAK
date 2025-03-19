package main;

public class Vonal {
    private int hossz;  
    private static int vonalakSzama = 0;  

    
    public Vonal(int hossz) {
        if (hossz < 1) {  
         hossz=1;
         
           
        }
        vonalakSzama++;
        this.hossz = hossz;
        
    }

    public boolean egyforma(Vonal masik) {
        return Vonal.egyformak(this, masik);
    }

    public String allapot() {
        return "Vonal { hossz=" + hossz + " }";  
    }

    public static boolean egyformak(Vonal egyik, Vonal masik) {
        return egyik.hossz == masik.hossz;
    }

    public static int getVonalakSzama() {
        return vonalakSzama;  
    }
    
}
