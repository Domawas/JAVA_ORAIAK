
package main;


public class kezelesTavol {
    public static void main(String[] args) {
        boolean siker = false;
        try {
            if(Double.isFinite(osztas(2, atalakitas("10"))));
            siker = true;
            
        } catch (NumberFormatException e) {
            System.out.println("hiba: átalakítás");
        }catch (ArithmeticException e) {
            System.out.println("hiba: osztás");
        } finally{
            if(siker){
                System.out.println("Sikeres volt a művelet");
            }else{
                
                System.out.println("Nem volt sikeres a művelet");
            }
            
            
        }
    }

    private static int atalakitas(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
    
    private static double osztas( int a, int b) throws ArithmeticException{
        return a/b;
    }
}
