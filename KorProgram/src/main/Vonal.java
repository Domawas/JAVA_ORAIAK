package main;

public class Vonal {

    private double vastagsag;
    private String szin;
    private String tipus;

    public Vonal(double vastagsag, String szin, String tipus) {
        this.vastagsag = vastagsag;
        this.szin = szin;
        this.tipus = tipus;
    }

    public double getVastagsag() {
        return vastagsag;
    }

    public void setVastagsag(double vastagsag) {
        this.vastagsag = vastagsag;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
