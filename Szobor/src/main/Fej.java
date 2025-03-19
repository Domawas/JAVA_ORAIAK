
package main;


public class Fej {
    private float sugar;
    private int x,y;
    Szobor szobor;
    
    public Fej(float sugar, int x, int y){
        this.sugar = sugar;
        this.x = x;
        this.y = y;
        szobor = new Szobor("fekete","régi",4,2);
    }
    
    public float getSugar(){
        return sugar;
    }
    
    public void setSugar(float sugar){
        this.sugar = sugar;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public float terulet(){
        return (float) (Math.PI * sugar * sugar);
    }
    
    public float kerulet(){
        return (float) (2 * sugar * Math.PI);
    }
    
    public String allapot(){
        return "állapot: {sugár: "+getSugar()+", x: "+getX()+", y: "+getY()+"}\nszín: "+szobor.getSzin()+", típus: "+szobor.getTipus()+", magassag: "+szobor.getMagassag()+" méter"+", terem: "+szobor.getTerem();
    }
    
    public void kiir(String str){
        System.out.println(str);
    }
}
