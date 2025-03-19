package main;

public class Euklideszi {

    

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.printf("A %d %d számok legnagyobb közös osztója: %d\n",a,b,euklideszi(a, b));
    }
    
    public static int euklideszi(int a, int b){
        assert a > 0 && b > 0 : "A bemeneti számoknak pozitívnak kell lenniük!";
        
        while (a!=b){
            int c;
            if (a<b){
                c=a;
                a=b;
                b=c;
            }
            assert a>=b:"a kisebb mint b";
            c=a;
            a=b;
            b=c-b;
                    
        }
        assert a==b:"a nem egyenlő b-vel";
        return a;
    }

}
