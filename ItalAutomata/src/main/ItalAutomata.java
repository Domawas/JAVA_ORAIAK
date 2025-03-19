
package main;

public class ItalAutomata {

    private String ital;  
    private String tipus;  
    private int db;      
    private int ar;      


    public ItalAutomata(String ital, String tipus, int db, int ar) {
        this.ital = ital;
        this.tipus = tipus;
        this.db = db;
        this.ar = ar;
    }

 
    public int getAr() {
        return ar;
    }

    
    public String getItal() {
        return ital;
    }

   
    public void csokkentDb() {
        if (db > 0) {
            db--;
        }
    }


    public boolean vanMennyi() {
        return db > 0;
    }

   
    public double vasarlas(int fizetettOsszeg) {
        if (!vanMennyi()) {
            System.out.println("Sajnáljuk, de nincs elérhető ital.");
            return -1;
        }
        if (fizetettOsszeg < ar) {
            System.out.println("Nincs elég pénz a vásárláshoz.");
            return -1;
        }
 
        csokkentDb();
       
        return fizetettOsszeg - ar;
    }


    public String allapot() {
        return "\nItal: " + ital + "\nTípus: " + tipus + "\nDarab: " + db + "\nÁr: " + ar;
    }
}
