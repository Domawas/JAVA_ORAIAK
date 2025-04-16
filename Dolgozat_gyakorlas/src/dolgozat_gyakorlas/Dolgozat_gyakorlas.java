
package dolgozat_gyakorlas;


public class Dolgozat_gyakorlas {


    public static void main(String[] args) {
        int szam = 20;
        System.out.printf("A %d-nél bagyobb, 0-ra végződő szám: %d\n", szam, vegzodoNullara(20));
        System.out.println("%3CmxGraphModel%3E%3Croot%3E%3CmxCell%20id%3D%220%22%2F%3E%3CmxCell%20id%3D%221%22%20parent%3D%220%22%2F%3E%3CmxCell%20id%3D%222%22%20value%3D%22Actor%22%20style%3D%22shape%3DumlActor%3BverticalLabelPosition%3Dbottom%3BverticalAlign%3Dtop%3Bhtml%3D1%3BoutlineConnect%3D0%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22-350%22%20y%3D%223590%22%20width%3D%2230%22%20height%3D%22160%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3C%2Froot%3E%3C%2FmxGraphModel%3E");
    }
    
    public static int vegzodoNullara(int szam){
        int elso = szam;
        do{
            szam++;
        }while (szam%10 != 0);
        //első szám kisebb, mint a vissz. érték
        assert elso < szam: "Az első szám kisebb, mint a vissz. érték";
        assert vegzodikEllenorzes(szam):"Nem 0-ra végződik";
        assert szam - elso <= 10: "a különbség nagyobb 10-nél";
        return szam;
       
    }

    private static boolean vegzodikEllenorzes(int szam) {
        String szoveg = Integer.toString(szam);
        return szoveg.charAt(szoveg.length()-1)=='0';
    }
   
}
    