
package main;


public class Szobor {
    private String szin, tipus;
    private int magassag;
    private int terem;
    
    
    public Szobor(String szin, String tipus, int magassag, int terem){
        this.szin = szin;
        this.tipus = tipus;
        this.magassag = magassag;
        this.terem = terem;
    }
    
    public String getSzin(){
        return szin;
    }
    public void setSzin(String szin){
        this.szin = szin;
    }
    
    public String getTipus(){
        return tipus;
    }
    
    public void setTipus(String tipus){
        this.tipus = tipus;
    }
    
    public int getMagassag(){
        return magassag;
    }
    
    public void setMagassag(int magassag){
        this.magassag = magassag;
    }
    
    public int getTerem(){
        return terem;
    }
    
    public void setTerem(int terem){
        this.terem = terem;
    }
    
    public String allapot() {
        return "Terem száma: " + terem;
    }
    
}
