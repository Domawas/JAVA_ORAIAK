package tortprogram;

public class TortProgram {

    public static void main(String[] args) {
        Tort t1 = new Tort();
        Tort t2 = new Tort();
        
        t1.szamlalo=1;
        t1.nevezo=3;
        t1.mutat();
        
        t2.szamlalo=4;
        t2.nevezo=6;
        t1 = t2.reciprokotVisszaad();
    }
}
