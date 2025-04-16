package main;

public class AssertDolgozatE{

    public static void main(String[] args) {
        assertVanEEgesz();
    }

    public static void assertVanEEgesz() {
        assert vanEEgesz(new double[]{}) == false;
        assert vanEEgesz(new double[]{3.4, 23.4, 1.2}) == false;
        assert vanEEgesz(new double[]{1.000, 23.5}) == true;
        assert vanEEgesz(new double[]{1, 2, 3}) == true;
        assert vanEEgesz(new double[]{3.0, 4.5, 5.5}) == true;
        assert vanEEgesz(new double[]{10.5, 5.0, 2.3}) == true;
        assert vanEEgesz(new double[]{5.0, -4.3, 2.0}) == true;
        assert vanEEgesz(new double[]{1000000000.0, 1.234567, 5.0}) == true;
        System.out.println("minden teszt sikeres");
    }

    public static boolean vanEEgesz(double[] sorozat) {
        for (double szám : sorozat) {
            if (szám == Math.floor(szám)) {
                return true;
            }
        }
        return false;
    }


}
