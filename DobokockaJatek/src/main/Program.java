package main;

public class Program {

    public static void main(String[] args) {

        int oldal;

        Dobokocka kocka1 = new Dobokocka(6);

        oldal = kocka1.getOldal();

        String s = "Dobás (%d): ".formatted(oldal);
        System.out.println(s + kocka1.getErtek());

        Dobokocka kocka2 = new Dobokocka(20);

        oldal = kocka2.getOldal();
        s = "Dobás (%d): ".formatted(oldal);
        System.out.println(s + kocka2.getErtek());

    }
}
