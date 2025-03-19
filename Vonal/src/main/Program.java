package main;

public class Program {

    public static void main(String[] args) {
        Vonal v1 = new Vonal(4);  
        Vonal v2 = new Vonal(4);  

        System.out.println("v1: " + v1.allapot());
        System.out.println("v2: " + v2.allapot());

        System.out.println("v1 == v2: " + v1.egyforma(v2));

        Vonal egyik = new Vonal(3);  
        Vonal masik = new Vonal(5);  

        System.out.println("egyik: " + egyik.allapot()); 
        System.out.println("masik: " + masik.allapot());

        System.out.println("a 2 vonal egyforma: " + (egyik.egyforma(masik)));

        System.out.println("Létrehozott vonalak száma: " + Vonal.getVonalakSzama());
    }
}
