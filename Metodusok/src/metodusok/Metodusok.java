package metodusok;

public class Metodusok {

    public static void main(String[] args) {
        kiirKonzolra(osszead(2, 5) + "\n");
        kiirKonzolra("********************************\nelső 10 N+ szám összege:");
        kiirKonzolra(f1_elso10SzamOsszege() + "\n********************************\n");
        f2_KettoSzamOsszegeKiirva();
        f3_HaromSzamOsszegenekGyokeKiirva();
        f4_NegySzamOsszegeKiirva();

    }

    static void kiirKonzolra(String szoveg) {
        System.out.print(szoveg + "");
    }

    static int osszead(int a, int b) {
        return a + b;

    }

    static int f1_elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 11; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    static void f2_KettoSzamOsszegeKiirva() {
        int a = 3;
        int b = 4;
        String str = "%d + %d = %d\n".formatted(a, b, osszead(a, b));

        kiirKonzolra(str);
    }

    static void f3_HaromSzamOsszegenekGyokeKiirva() {
        int a = 3;
        int b = 4;
        int c = 5;
        String str = "%d + %d + %d gyöke az".formatted(a, b, c);
        kiirKonzolra(str);
        c = c + osszead(a, b);
        double gyok = Math.sqrt(c);
        str = "%.4f".formatted(gyok);
        kiirKonzolra(str);

    }

    static void f4_NegySzamOsszegeKiirva() {
        int a = 3;
        int b = 4;
        int c = 7;
        int d = -1;

        int osszeg = osszead(osszead(a, b), osszead(c, d));
        String str = "%d + %d + %d + (%d) = %d".formatted(a, b, c, d, osszeg);
        kiirKonzolra(str);
    }

    void eljaras() {
        System.out.println("Hello World");
    }

    void fuggveny() {
        int a = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }

}
