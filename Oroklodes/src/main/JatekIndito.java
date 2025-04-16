
package main;


public class JatekIndito {

    public static void main(String[] args) {
        Jatek csigas = new CsigasJatek();
        Jatek kitalalos = new KitalalosJatek();
        
        Jatek[] jatekok = {csigas,kitalalos, new Jatek()};
        
        for (Jatek jatek : jatekok) {
            //if(jatek instanceof KitalalosJatek){
                //KitalalosJatek k = (KitalalosJatek) jatek;
                //k.start();
            //} 
            jatek.start();
        }
        
        System.out.println("-------------------------------\npiros\n---------------------------------\nzöld\n-------------------------------\n3\n----------------------------\n");
    }
}   

//Csiga
