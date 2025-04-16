
package main;

public class Program {
    public static void main(String[] args) {
        Vonal2 v1 = new Vonal2("piros", 20, "szaggatott", 5);
        
        System.out.println(v1.allapot());
        v1.rajz();

        Vonal2 v2 = new Vonal2("fekete", 10.0, "normál", 0.0);
        v2.setSzin("kék");
        v2.setHossz(15);
        v2.setForma("dupla");
        v2.setEltolas(2);
        
        System.out.println(v2.allapot());
        v2.rajz();
    }
}
