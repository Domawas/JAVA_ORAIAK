
package main;

import java.util.Scanner;


public class TipikusHibak {
    
    private static final Scanner SC = new Scanner(System.in);
  
    public static void main(String[] args) {
//        osztas_0_egesz();
        osztas_0_valos();
        if(Double.isNaN(1.0/0)){
        System.out.println("Infinity az eredmeny");
        }
        
        System.out.println(Math.sqrt(-1));
        if(Double.isNaN(Math.cbrt(Math.sqrt(-1)))){
            System.out.println("NaN köbgyöke az NaN");
        }
        
//        System.out.println("Egesz:");
//        SC.nextInt();
        
//        System.out.println("valós:" );
//        SC.nextDouble();
   
//        System.out.println("CSAK EGÉSZ SZÁMOT TARTALMAZÓ SZÖVEG: ");
//        String str = SC.nextLine();
//        Integer.parseInt(str);
//        
//        System.out.println("program vége");
        
        
        System.out.println("CSAK VALÓS SZÁMOT TARTALMAZÓ SZÖVEG: ");
        String str = SC.nextLine();
        Double.parseDouble(str);
        
        System.out.println("program vége");
        
        
    
    
    
    }

    private static void osztas_0_egesz() {
        System.out.println(1/0);
        int a =2, b=0;
        System.out.println(a/b);
    }
    
    public static void osztas_0_valos(){
        System.out.println(1.0/0);
        double a = 1, b = 0;
        System.out.println(a/b);
        
    }
    
    
}
