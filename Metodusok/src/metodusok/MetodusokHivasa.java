
package metodusok;

import java.util.Random;
import java.util.Scanner;
import static metodusok.Metodusok.kiirKonzolra;
public class MetodusokHivasa {

    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random(); 
    
    public static void main(String[] args) {
        System.out.print("Kérek 1 egész számot: ");
        int szam = scanner.nextInt();
        int randomsz = random.nextInt(1, 101);
        System.out.println("A generált szám: " + randomsz);
        Metodusok.osszead(szam, randomsz);
        String str = "%d + %d = %d".formatted(szam,randomsz,Metodusok.osszead(szam, randomsz));
        kiirKonzolra(str);
        
        
        Metodusok metodusok = new Metodusok();
        metodusok.eljaras();
        metodusok.fuggveny();
        
    }
    
}
