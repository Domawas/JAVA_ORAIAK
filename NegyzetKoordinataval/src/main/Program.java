package main;

public class Program {

    public static void main(String[] args) {
        static final String
        // Negyzet példányosítása
        Negyzet n = new Negyzet(2);  // Most már a konstruktorhoz egy paramétert kell átadni
        // Koord példányosítása
        n.koord = new Koord(3, 4);  // Koord példány létrehozása, x=3, y=4

        System.out.println(n.allapot());  // Kiírjuk a négyzet állapotát
        System.out.println(n.pozicio().allapot());  // Kiírjuk a koordináták állapotát
    }
}
