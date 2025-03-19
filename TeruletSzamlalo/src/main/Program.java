package main;

public class Program {

    public static void main(String[] args) {

        Negyzet negyzet1 = new Negyzet(3);
        
        System.out.print("Állapot: " + negyzet1.allapot());
        System.out.println("\nTerület: " + negyzet1.terulet());
        
        Negyzet negyzet2 = new Negyzet(5);
        
        System.out.print("Állapot: " + negyzet2.allapot());
        
        int oldal = negyzet2.getA();
        String s = "\nterülete (%d): ".formatted(oldal);
        System.out.println(s + negyzet2.terulet());
        

    }
}
