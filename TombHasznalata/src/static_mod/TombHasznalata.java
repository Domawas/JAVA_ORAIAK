
package static_mod;


public class TombHasznalata {

    public static void main(String[] args) {
        int[] tomb1 = {10,20,30};
        kiirTomb("int[] tomb1 = {10,20,30}: ", tomb1);
    }

    private static void kiirTomb(String cim, int[] tomb) {
        System.out.println(cim);
        int db = tomb.length;
        for(int i = 0; i<db; i++){
            System.out.printf("[%d] = %d\n", i, tomb[i]);
        }
    }
    
}
