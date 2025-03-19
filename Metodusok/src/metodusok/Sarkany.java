package metodusok;

import java.util.Scanner;

public class Sarkany {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] eredmeny = sarkanyok();
        if (eredmeny != null) {
            kiirKonzolra("7 fejű sárkányok száma: " + eredmeny[0] + ", 11 fejű sárkányok száma: " + eredmeny[1]);
        } else {
            kiirKonzolra("Nincs érvényes megoldás a 7 és 11 fejű sárkányok számára.");
        }
    
       
        kiirKonzolra("Hány fejű legyen az egyik? ");
        int egyik = scanner.nextInt();
        kiirKonzolra("Hány fejű legyen a másik? ");
        int masik = scanner.nextInt();
        kiirKonzolra("Összesen hány fej legyen? ");
        int osszesen = scanner.nextInt();
        
        
        sarkany(egyik, masik, osszesen);
    }

   
    static int[] sarkanyok() {
        int hetfeju = 1;
        while (hetfeju <= 145) {
            int tizenegy = (145 - 7 * hetfeju) / 11;
            
            
            if (tizenegy == (int) tizenegy && tizenegy >= 1) {
                return new int[]{hetfeju, tizenegy};
            }
            hetfeju++;
        }
        return null;
    }

    
    static void sarkany(int egyik, int masik, int osszesen) {
        
        int x = 1;
        while (x <= osszesen) {
            int y = (osszesen - x * egyik) / masik;
            
          
            if (y == (int) y && y >= 1) {
                kiirKonzolra("A szigeten " + x + " darab " + egyik + " fejű és " + y + " darab " + masik + " fejű sárkány él.");
                return;  
            }
            x++;
        }

       
        kiirKonzolra("Nincs érvényes megoldás a megadott paraméterekkel.");
    }

   
    static void kiirKonzolra(String szoveg) {
        System.out.println(szoveg);
    }
}
