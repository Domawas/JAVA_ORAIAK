
package test;

import main.Muvelet;


public class MuveletTest {
    public static void main(String[] args) {
        MuveletTest prg = new MuveletTest();
        prg.testOsztas();
    }

    void testOsztas() {
        double e = Muvelet.osztas();
        System.out.println("kapott eredmény: " + e);
    }
}
