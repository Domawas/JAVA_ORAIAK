package main;

public class Vonal2 {

    private String szin;
    private double hossz;
    private String forma;
    private double eltolas;

    public Vonal2(String szin, double hossz, String forma, double eltolas) {
        this.szin = szin;
        this.hossz = hossz;
        this.forma = forma;
        setEltolas(eltolas);
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public double getHossz() {
        return hossz;
    }

    public void setHossz(double hossz) {
        this.hossz = hossz;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getEltolas() {
        return eltolas;
    }

    public void setEltolas(double eltolas) {
        if (eltolas >= 0) {
            this.eltolas = eltolas;
        } else {
            throw new IllegalArgumentException("Eltolás nem lehet negatív!");
        }
    }

    public String allapot() {
        return "Vonal állapota:\n"
                + "Szín: " + szin + "\n"
                + "Hossz: " + hossz + "\n"
                + "Forma: " + forma + "\n"
                + "Eltolás: " + eltolas;
    }

    public void rajz() {
        StringBuilder vonal = new StringBuilder();
        String karakter = "";

        if (forma.equals("szaggatott")) {
            karakter = "-";
        } else if (forma.equals("normál")) {
            karakter = "_";
        } else if (forma.equals("dupla")) {
            karakter = "=";
        } else if (forma.equals("pont")) {
            karakter = ".";
        } else {
            karakter = "_";
        }

        for (int i = 0; i < eltolas; i++) {
            vonal.append(" ");
        }

        for (int i = 0; i < hossz; i++) {
            vonal.append(karakter);
        }

        System.out.println(vonal.toString());
    }

}
