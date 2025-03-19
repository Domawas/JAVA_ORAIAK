package tortprogram;

public class Tort {

    int szamlalo;
    int nevezo;

    void mutat() {
        System.out.println("tört állapota: " + szamlalo + "/" + nevezo);

    }

    double ertek() {
        return (double) szamlalo / nevezo;
    }

    void reciprokraValt() {
        int tmp = nevezo;
        nevezo = szamlalo;
        szamlalo = tmp;
    }

    Tort reciprokotVisszaad() {
        Tort uj = new Tort();
        uj.szamlalo = this.nevezo;
        uj.nevezo = this.szamlalo;
        return uj;
    }


}
