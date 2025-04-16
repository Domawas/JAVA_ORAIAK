package teszt;

import main.Vonal2;

public class Vonal2Teszt {

    public static void main(String[] args) {
        new Vonal2Teszt();
    }

    public Vonal2Teszt() {
        tesztKonstruktorJoAdatokkal();
        tesztSzinJoAdatokkal();
        tesztEltolasHibasAdat();
        tesztRajzMetodus();
    }

    void tesztKonstruktorJoAdatokkal() {
        String vartSzin = "piros";
        double vartHossz = 10;
        String vartForma = "szaggatott";
        double vartEltolas = 5;

        Vonal2 vonal = new Vonal2(vartSzin, vartHossz, vartForma, vartEltolas);

        String kapottSzin = vonal.getSzin();
        double kapottHossz = vonal.getHossz();
        String kapottForma = vonal.getForma();
        double kapottEltolas = vonal.getEltolas();

        assert kapottSzin.equals(vartSzin) : "Hiba: szín nem megfelelő --> " + kapottSzin;
        assert kapottHossz == vartHossz : "Hiba: hossz nem megfelelő --> " + kapottHossz;
        assert kapottForma.equals(vartForma) : "Hiba: forma nem megfelelő --> " + kapottForma;
        assert kapottEltolas == vartEltolas : "Hiba: eltolás nem megfelelő --> " + kapottEltolas;

        System.out.println("Konstruktor teszt: rendben");
    }

    void tesztSzinJoAdatokkal() {
        Vonal2 vonal = new Vonal2("piros", 10, "szaggatott", 5);
        String vartSzin = "zöld";
        vonal.setSzin(vartSzin);

        String kapottSzin = vonal.getSzin();
        assert kapottSzin.equals(vartSzin) : "Hiba: szín nem megfelelő --> " + kapottSzin;

        System.out.println("SetSzin teszt: rendben");
    }

    void tesztEltolasHibasAdat() {
        try {
            Vonal2 vonal = new Vonal2("piros", 10, "szaggatott", 5);
            vonal.setEltolas(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Eltolás setter teszt: rendben");
        }
    }

    void tesztRajzMetodus() {
        Vonal2 vonal = new Vonal2("kék", 10, "szaggatott", 5);
        System.out.println("Rajz teszt:");
        vonal.rajz();
    }
}
