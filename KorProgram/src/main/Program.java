package main;

public class Program {
    public static void main(String[] args) {
        Kor kor = new Kor(5.0, 0, 0, 2.0, "piros", "pontozott");

        System.out.println("Terület: " + kor.terulet());
        System.out.println("Kerület: " + kor.kerulet());
        System.out.println(kor.allapot());

        kor.setSzin("kék");
        System.out.println("Új vonal szín: " + kor.getSzin());

        kor.mozgatas(3, 4);
        System.out.println("Kör új pozíciója: (" + kor.getPozicio().getX() + ", " + kor.getPozicio().getY() + ")");
        
        kor.nyujt(7.0);
        System.out.println("Új sugár: " + kor.getSugar());
    }
}
