package metodusok;

public class Progtetetel {

    public static void main(String[] args) {
        int[] sorozat = {3, 5, 1, 2, 8, 17, 6};
        int hossz = sorozat.length;
        

        System.out.println("A sorozat elemei: ");
        for (int i : sorozat) {
            System.out.print(i + " ");
        }
        System.out.println();
        
 
        System.out.println("Összeg: %d" .formatted(Progtetetel.osszegzes(sorozat, hossz)));
        

        System.out.println("Páratlanok száma: " + megszamlalas(sorozat, hossz));
        

        int i = minKivalasztas(sorozat, hossz);
        System.out.println("Legkisebb elem helye: " + i + ", értéke: " + sorozat[i]);
        

        i = maxKivalasztas(sorozat, hossz);
        System.out.println("Legnagyobb elem helye: %d" + i + ", értéke: " + sorozat[i]);
        
     
        i = kivalasztas(sorozat, hossz);
        if (i != -1) {
            System.out.println("Az első 5-nél nagyobb elem helye: " + i + ", értéke: " + sorozat[i]);
        } else {
            System.out.println("Nincs 5-nél nagyobb elem.");
        }
    
        String valasz = eldontesEgy(sorozat, hossz) ? "van" : "nincs";
        System.out.println("Van benne 4-nél nagyobb páros: " + valasz);
        
        
        valasz = eldontesMind(sorozat, hossz) ? "igen mind" : "nem mind";
        System.out.println("Minden elem nagyobb 5-nél: " + valasz);
        
    
        System.out.print("Ha van benne 0, akkor hol: ");
        i = linearisKereses(sorozat, hossz);
        if (i > -1) {
            System.out.println("a(z) " + i + ". indexen.");
        } else {
            System.out.println("Nincs ilyen elem.");
        }
    }

    static int osszegzes(int[] sorozat, int hossz) {
        int osszeg = 0;
        for (int i = 0; i < hossz; i++) {
            osszeg += sorozat[i];
        }
        return osszeg;
    }

    static int megszamlalas(int[] sorozat, int hossz) {
        int osszeg = 0;
        for (int i = 0; i < hossz; i++) {
            if (sorozat[i] % 2 == 1) {
                osszeg++;
            }
        }
        return osszeg;
    }

    static int minKivalasztas(int[] sorozat, int hossz) {
        int minIndex = 0;
        for (int i = 1; i < hossz; i++) {
            if (sorozat[i] < sorozat[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int maxKivalasztas(int[] sorozat, int hossz) {
        int maxIndex = 0;
        for (int i = 1; i < hossz; i++) {
            if (sorozat[i] > sorozat[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int kivalasztas(int[] sorozat, int hossz) {
        int i = 0;
        while (i < hossz && !(sorozat[i] % 2 == 0 && sorozat[i] > 4)) {
            i++;
        }
        if (i < hossz) {
            return i;
        } else {
            return -1;
        }
    }

    static boolean eldontesEgy(int[] sorozat, int hossz) {
        int i = 0;
        while (i < hossz && !(sorozat[i] % 2 == 0 && sorozat[i] > 4)) {
            i++;
        }
        return i < hossz;
    }

    static boolean eldontesMind(int[] sorozat, int hossz) {
        int i = 0;
        while (i < hossz && sorozat[i] > 5) {
            i++;
        }
        return i >= hossz;
    }

    static int linearisKereses(int[] sorozat, int hossz) {
        int i = 0;
        while (i < hossz && sorozat[i] != 0) {
            i++;
        }
        if (i < hossz) {
            return i;
        } else {
            return -1; 
        }
    }
}
