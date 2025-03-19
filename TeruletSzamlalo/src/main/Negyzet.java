package main;

public class Negyzet {

    private int a;

    public Negyzet(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public double terulet(){
        return a * a;
    }

    public String allapot() {
        return "négyzet oldala: " + a;
    }
}
