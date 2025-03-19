package main;
//    Tordai Levente, Marek Bendegúz, Nagy Dominik, Tóth Barnabás
public class Program {
    public static void main(String[] args) {

        ItalAutomata pepsi = new ItalAutomata("Pepsi", "Szénsavas", 10, 200);
        ItalAutomata kave = new ItalAutomata("Kávé", "Meleg ital", 3, 350);

        
        Vevo vevo1 = new Vevo(500);  
        Vevo vevo2 = new Vevo(100);  

        
        System.out.println("Automata állapota:\n" + pepsi.allapot());
        System.out.println("Automata állapota:\n" + kave.allapot());
        vevo1.vasarlas(pepsi); 
        vevo2.vasarlas(kave);  
        System.out.println("*******************************************\n*******************************************");
        System.out.println("Automata állapota a vásárlások után:\n" + pepsi.allapot());
        System.out.println("\nAutomata állapota a vásárlások után:\n" + kave.allapot());
    }
}