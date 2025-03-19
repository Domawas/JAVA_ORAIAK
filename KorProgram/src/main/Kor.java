package main;

public class Kor {
    private double sugar;
    private Pozicio pozicio;
    private Vonal vonal;

    public Kor(double sugar, int x, int y, double vastagsag, String szin, String tipus) {
        this.sugar = sugar;
        this.pozicio = new Pozicio(x, y);
        this.vonal = new Vonal(vastagsag, szin, tipus);
    }

    public double terulet() {
        return Math.PI * sugar * sugar;
    }

    public double kerulet() {
        return 2 * Math.PI * sugar;
    }

    public void nyujt(double ujSugar) {
        this.sugar = ujSugar;
    }

    public void mozgatas(int vizszint, int fuggoleges) {
        pozicio.mozgatas(vizszint, fuggoleges);
    }

    public String getSzin() {
        return vonal.getSzin();
    }

    public void setSzin(String szin) {
        vonal.setSzin(szin);
    }

    public String allapot() {
        return "Kör középpontja: (" + pozicio.getX() + ", " + pozicio.getY() + "), Sugár: " + sugar + 
               ", Vonal színe: " + vonal.getSzin() + ", Vonal vastagsága: " + vonal.getVastagsag() + ", Típus: " + vonal.getTipus();
    }

    public double getSugar() {
        return sugar;
    }

    public Pozicio getPozicio() {
        return pozicio;
    }

    public Vonal getVonal() {
        return vonal;
    }
}
