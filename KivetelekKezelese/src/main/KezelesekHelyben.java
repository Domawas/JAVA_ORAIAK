/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class KezelesekHelyben {
    public static void main(String[] args) {
        /* System.err*/ 
        //System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        System.out.println("Kivételek kezelése a keletketés helyén:");
        egyKivetelElkapasa();
        
        System.out.println("Program vége");
    }

    private static void egyKivetelElkapasa() {
        int a=2, b=0; //b értékét bekérjük
        try {
            double eredmény = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Nem sikerült az osztás!");
            System.err.println("hiba oka: " + e.getMessage());
            System.err.println("Az eredeti kivétel: ");
            e.printStackTrace();
        }finally{
            /*ide mindenképpen eljut a program
            tipikusan itt végzik az erőforrás felszabadítását*/
            System.out.println("osztás vége");
        }
    }
    
    private static void tobbKivetelElkapasa(){
        String str ="a";
        try {
            int szam = Integer.parseInt(str);
            double e = 2/szam;
            System.out.println("eremény: " + e);
        } catch (ArithmeticException e) {
            System.err.print("Nem sikerült az osztás: ");
            System.err.print(e.getMessage() + "\n");
        }catch (NumberFormatException e) {
            System.err.print("Hibás számformátum:: ");
            System.err.print(e.getMessage() + "\n");
        }catch (Exception e) {
            System.err.print("Nem várt kivétel: ");
            System.err.print(e.getMessage() + "\n");
            System.err.println("A kivétel osztályai: ");
            System.err.println(e.getClass().getSimpleName());
        }
        
    }
}
