
package main;


public class Program {


    public static void main(String[] args) {
        Asztal emelet1 = new Asztal();
        emelet1.szin = "Fehér";
        emelet1.magassag = 1;     //int
        emelet1.szelesseg = 1.2;  //double
        emelet1.velemeny();
        
        Asztal emelet2 = new Asztal();
        emelet2.szin = "Szürke";
        emelet2.magassag = 1;   
        emelet2.szelesseg = 1.5;
        emelet2.velemeny();
        
        
        Asztal emelet3 = new Asztal();
        emelet3.szin = "Kék";
        emelet3.magassag = 1;
        emelet3.szelesseg = 1.1;
        emelet3.velemeny();
        
    }
    
}
