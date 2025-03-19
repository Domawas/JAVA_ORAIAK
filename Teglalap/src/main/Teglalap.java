
package main;


public class Teglalap {
    private int a;
    private int b;
    
    public Teglalap(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getA(){
        return a;
    }
    void setA(int a){
        this.a = a;
    }
    
    public int getB(){
        return b;
    }
    void setB(int b){
        this.b = b;
    }
    public String allapot(){
        return "a: " + a + " b: " + b;
    }
    public double terulet(){
        return a * b;
    }
    public double kerulet(){
        return 2 * (a + b);
    }
}
