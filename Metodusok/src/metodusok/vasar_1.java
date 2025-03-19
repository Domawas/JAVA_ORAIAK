/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodusok;

/**
 *
 * @author NagyDominik(Szf_N_20
 */
public class vasar_1 {
    public static void main(String[] args) {
        int i = 0, t=0;
        for (int s = 1; s <= 28; s++) {
            for (int k = 1; k <= 72; k++) {
                for (int j = 1; j <= 98; j++) {
                    i++;
                    int db = s+k+j;
                    double d1 = k*1.33333;
                    double d2 = k*1.3;
                    double d3 = k*4/3;
                    double d4 = k*4.0/3;
                    
                    double arany = s*3.5 + d4 + j*0.5;
                    if(db == 100 && arany == 100){
                        t++;
                        System.out.printf("%-7s %d\n", "sertés:",s); 
                        System.out  .printf("%-7s %d\n", "kecske:",k); 
                        System.out.printf("%-7s %d\n", "juh:",j); 
                        System.out.printf("-----------------------\n"); 
                   }
                    
                    
                }
                
            }
            
        }
        System.out.println("találatok száma: " + t + "( a helyes: 3)");
        System.out.println("iterációk száma: " + i);
    }
    
    
}
