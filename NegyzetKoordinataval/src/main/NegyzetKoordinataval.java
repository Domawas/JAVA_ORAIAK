package main;

public class Negyzet {

    private int a;
    private Koord koord;

    // Konstruktor, amely inicializálja az 'a' értékét
    public Negyzet(int a) {
        setA(a);
        koord = new Koord(0,0);
    }

    // Getter és setter metódusok
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = Math.max(0, 1);
    }

    // Négyzet területe
    public double terulet() {
        return a * a;
    }

    // Négyzet állapotának kiírása
    public String allapot() {
        return "állapot: Negyzet { a=" + a + ", koord=Koord { " + " }" ;
    }

    // Pozíció, amely a Koord objektumot adja vissza
    public Koord pozicio() {
        return koord;  // Most már visszaadja a Koord objektumot
    }
}


